package eecs2030.lab3;

import java.util.Arrays;

/**
 * An immutable class implementing a 3D vector 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 *
 */
public class Vector3 implements Comparable <Vector3>{
	//Make all elements of array write once
	private final double x, y, z;
	
	//Make references array write once
	private final double[] vector;

	/**
	 * Creates a 3D vector from 3 numeric scalar components
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	public Vector3(double x, double y, double z) {
		//Assign inputs to elements
		this.x = x;
		this.y = y;
		this.z = z;
		
		//Create array with immutable variables
		this.vector = new double[]{this.x, this.y, this.z};
	}

	/**
	 * Creates a 3D vector from an array
	 * @param v array containing 3 components of the desired vector 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(double[] v) {
		//Check dimensions
		if(v.length == 3)
		{
			//Copy array elements into vector elements
			this.x = v[0];
			this.y = v[1];
			this.z = v[2];
			
			//Create array holding references to immutable fields
			this.vector = new double[] {this.x, this.y, this.z};
			
			/*
			this.x = 0;
			this.y = 0;
			this.z = 0;
			this.vector = new double[3];
			for(int i =0; i< v.length; i++) {
				this.vector[i] = v[i];
			}*/
			
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Clones an existing vector
	 * @param old an existing Vector3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(Vector3 old) {
		//Copy fields from old Vector3 to new Vector3
		this.x = old.x;
		this.y = old.y;
		this.z = old.z;
		this.vector = old.vector;
	}

	/**
	 * Returns a vector component at a specified index
	 * @param index the index of the vector component
	 * @return vector component as a scalar
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public double getElement (int index){
		//Check index if it is within bounds
		if(index >= 0 && index < 3)
		{
			return vector[index];
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Returns vector components as an array
	 * @return vector components, first element at index [0], and so on
	 */
	public double[] getElements (){
		//Return a copy of the vector array
		return new double[] {this.x, this.y, this.z};
	}

	@Override
	public int hashCode() {
		//Return hashcode using standard 1D array definition
		return Arrays.hashCode(vector);
	}

	@Override
	public boolean equals(Object obj) {
		//Check if object is null
		if(obj == null)
		{
			return false;
		}
		//Check if object type is the same
		else if(obj.getClass() == Vector3.class)
		{
			//Check if vector arrays are equal using standard Arrays object comparison
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
		//Declare and initialize calculation variables
		double mag1 = Math.sqrt(x*x + y*y + z*z),
			   ox = o.getElement(0),
			   oy = o.getElement(1),
			   oz = o.getElement(2),
			   mag2 = Math.sqrt(ox*ox + oy*oy + oz*oz);
		
		//Return based on comparison
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
