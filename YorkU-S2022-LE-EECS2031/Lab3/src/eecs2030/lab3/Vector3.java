package eecs2030.lab3;

import java.util.Arrays;

/**
 * An immutable class implementing a 3D vector 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 *
 */
public class Vector3 implements Comparable <Vector3>{
	//TODO
	//consider how to ensure the objects are immutable
	private final double x, y, z;
	private final double[] vector;

	/**
	 * Creates a 3D vector from 3 numeric scalar components
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	public Vector3(double x, double y, double z) {
		//TODO
		this.x = x;
		this.y = y;
		this.z = z;
		this.vector = new double[]{this.x, this.y, this.z};
	}

	/**
	 * Creates a 3D vector from an array
	 * @param v array containing 3 components of the desired vector 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(double[] v) {
		//TODO
		//consider how to ensure the objects are immutable
		this.vector = new double[3];
		
		if(v.length == 3) {
			for(int i =0; i< v.length; i++) {
				this.vector[i] = v[i];
			}
		}
	}

	/**
	 * Clones an existing vector
	 * @param old an existing Vector3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(Vector3 old) {
		//TODO
		//consider how to ensure the objects are immutable
		this.vector = new double[3];
		
		if(old.vector.length == 3) {
			for(int i =0; i< old.vector.length; i++) {
				this.vector[i] = old.vector[i];
			}
		}
		//this.vector = old.vector;
	}

	/**
	 * Returns a vector component at a specified index
	 * @param index the index of the vector component
	 * @return vector component as a scalar
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public double getElement (int index){
		//TODO
		if(index < 0 || index > 2) {
			throw new IllegalArgumentException();
		}else {
			return vector[index];
		}
	}

	/**
	 * Returns vector components as an array
	 * @return vector components, first element at index [0], and so on
	 */
	public double[] getElements (){
		//TODO
		//consider how to ensure the objects are immutable
		return Arrays.copyOf(vector, 3);
	}

	@Override
	public int hashCode() {
		//TODO
		return Arrays.hashCode(vector);
	}

	@Override
	public boolean equals(Object obj) {
		//TODO
		if(obj == null)
		{
			return false;
		}
		else if(obj.getClass() == Vector3.class)
		{
			Vector3 other = (Vector3) obj;
			return Arrays.equals(this.vector, other.vector);
		}
		else
		{
			return false;
		}
	}

	/**
	 * Compares vectors by their magnitudes
	 * @return -1 if o is greater than this, 0 if equal, 1 otherwise
	 */
	@Override
	public int compareTo(Vector3 o) {
		//TODO
		double mag1 = Math.sqrt(vector[0]*vector[0] + vector[1]*vector[1] + vector[2]*vector[2]),
			   ox = o.getElement(0),
			   oy = o.getElement(1),
			   oz = o.getElement(2),
			   mag2 = Math.sqrt(ox*ox + oy*oy + oz*oz);
		
		if(mag1 > mag2)
		{
			return 1;
		}
		else if(mag1 < mag2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
