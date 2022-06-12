package eecs2030.lab3;

/**
 * A utility class containing some matrix/vector operations
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 */
public class MVMath {
	//TODO
	//ensure this class is a utility class and no objects are ever created
	
	//Empty private constructor
	private MVMath(){}
	
	/**
	 * Multiplies a matrix by a vector
	 * @param m matrix
	 * @param v vector
	 * @return new vector object containing the result
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public static Vector3 multiply (Matrix3 m, Vector3 v){
		//Standard matrix vector multiplication between 3x3 matrix and 3x1 vector
		double x = m.getElement(0, 0) * v.getElement(0) + m.getElement(0, 1) * v.getElement(1) + m.getElement(0, 2) * v.getElement(2),
			   y = m.getElement(1, 0) * v.getElement(0) + m.getElement(1, 1) * v.getElement(1) + m.getElement(1, 2) * v.getElement(2),
			   z = m.getElement(2, 0) * v.getElement(0) + m.getElement(2, 1) * v.getElement(1) + m.getElement(2, 2) * v.getElement(2);
		
		//Create a new Vector3 object and return it
		return new Vector3(x, y, z);
	}

	/**
	 * @param m1 matrix 1
	 * @param m2 matrix 2
	 * @return new matrix object containing the result
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public static Matrix3 multiply (Matrix3 m1, Matrix3 m2){
		//Declare result array
		double[][] m3 = new double[3][3];
		
		//Standard matrix multiplication between 3x3 matrices
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 3; x++)
			{
				m3[y][x] = m1.getElement(y, 0) * m2.getElement(0, x)
						 + m1.getElement(y, 1) * m2.getElement(1, x)
						 + m1.getElement(y, 2) * m2.getElement(2, x);
			}
		}
		
		//Create new Matrix3 object and return it
	    return new Matrix3(m3);
	}
	
	/**
	 * Computes a cross product of two vectors
	 * @param v1 vector 1
	 * @param v2 vector 2
	 * @return a new vector object containing the result
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public static Vector3 crossProduct (Vector3 v1, Vector3 v2){
		//Cross product between two vectors
		double x = v1.getElement(1) * v2.getElement(2) - v1.getElement(2) * v2.getElement(1),
			   y = -1.0 * (v1.getElement(0) * v2.getElement(2) - v1.getElement(2) * v2.getElement(0)),
			   z = v1.getElement(0) * v2.getElement(1) - v1.getElement(1) * v2.getElement(0);
		
		//Create new Vector3 and return it
		return new Vector3(x, y, z);
	}

	/**
	 * Computes a dot product of two vectors
	 * @param v1 vector 1
	 * @param v2 vector 2
	 * @return dot product (a scalar)
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public static double dotProduct (Vector3 v1, Vector3 v2){
		//Calculate dot product and return
		return v1.getElement(0) * v2.getElement(0) + v1.getElement(1) * v2.getElement(1) + v1.getElement(2) * v2.getElement(2);
	}

}
