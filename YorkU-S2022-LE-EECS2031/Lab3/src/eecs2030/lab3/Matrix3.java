package eecs2030.lab3;

/**
 * An immutable class implementing a 3x3 matrix 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 */
public class Matrix3 {
	//TODO
	//consider how to ensure the objects are immutable
	private final double[][] array1;
	
	/**
	 * Creates a 3x3 matrix from an 2D array
	 * @param array array containing the elements of the desired matrix
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(double[][] array) {
		//TODO
		//HERE, consider how to ensure the objects are immutable
		/*if(array.length == 3 && array[0].length == 3 && array[1].length == 3 && array[2].length == 3 ) {
			double[][] copy = new double[3][3];
			copy = array;
			this.array1 = copy;
		}*/
		array1 = new double[3][3];
		
		if(array.length == 3 && array[0].length == 3 && array[1].length == 3 && array[2].length == 3 ) {
			for(int i=0; i<array.length; i++) {
				for(int j=0; j< array[i].length; j++) {
					array1[i][j] = array[i][j];
				}
			}
		}
		
		
		
	}
	
	/**
	 * Clones an existing matrix
	 * @param old an existing Matrix3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(Matrix3 old) {
		//TODO
		//consider how to ensure the objects are immutable
		array1 = new double[3][3];
		for(int i=0; i<old.array1.length; i++) {
			for(int j=0; j< old.array1[i].length; j++) {
				array1[i][j] = old.array1[i][j];
			}
		}
		//this.array1 = old.array1;
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
		double[][] copy = new double[array1.length][];
		 
        for (int i = 0; i < array1.length; i++) {
            copy[i] = new double[array1[i].length];
            System.arraycopy(array1[i], 0, copy[i], 0, array1[i].length);
        }
        
		return copy;
	}

}
