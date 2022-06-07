package eecs2030.lab3;

import java.util.ArrayList;

/**
 * An immutable class implementing a 3x3 matrix 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 */
public class Matrix3 {
	//TODO
	//consider how to ensure the objects are immutable
	private static final int row = 3;
	private static final int column = 3;
	private double[][] array1;
	
	private Matrix3() {
		this.array1 = new double[row][column];
	}
	/**
	 * Creates a 3x3 matrix from an 2D array
	 * @param array array containing the elements of the desired matrix
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(double[][] array) {
		//TODO
		//HERE, consider how to ensure the objects are immutable
		this.array1 = array;
	}
	
	/**
	 * Clones an existing matrix
	 * @param old an existing Matrix3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(Matrix3 old) {
		//TODO
		//consider how to ensure the objects are immutable
		final Matrix3 oldMatrix = old;
	}

	/**
	 * Returns a matrix element at a row, column
	 * @param row row
	 * @param column column
	 * @return matrix element as a scalar
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public double getElement (int row, int column){
		//TODO
		return this.array1[row][column];
	}
	
	/**
	 * Returns matrix elements as a 2D array
	 * @return 2D array containing 9 matrix elements
	 */
	public double[][] getElements (){
		//TODO
		//HERE, consider how to ensure the objects are immutable
		return this.array1;
	}

}
