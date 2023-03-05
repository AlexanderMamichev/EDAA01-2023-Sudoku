package Sudoku;

public interface SudokuSolver {
/**
 * Sets the digit number in the box row, col.
 * 
 * @param row   The row 
 * @param col The column 
 * @param number The digit number to insert in row,col. 
 * @throws IlligalArgumentException if number is outside[1 to 9 ], or if one trying to set it outside bounderies,
 *                                                                 row or column is outside[0 to 8].
 * 
 * 
 * 
 */
	void setNumber(int row, int col, int number);
	/**
	 * checks if the number that we want to pass into sudoku can be assigned to the chosen row and column. If it is not possible 
	 * according to rules return false 
	 * 
	 * @param row  The row 
	 * @param col  The column
	 * @param number The digit to insert into sudoku (row ,col)
	 * @return
	 * 
	 * @throws IlleagalArgumentException if number is outside[1 to 9] or row or col is outside [0..8]
	 *  
	 */
	
	boolean trySetNumber(int row, int col, int number);
	
	
	int getNumber(int row, int col);
	
	/**
	 * Removes the number at the row "row" and column "col";
	 * 
	 * @param row		The row
	 * @param col		The column
	 * @throws IllegalArgumentException if row or col is outside [0..8]
	 */
	void removeNumber(int row, int col);

	/**
	 * Removes all the numbers from the sudoku.
	 */
	void clear();

	/**
	 * Solves the soduku and returns true if it is solvable. 
	 * 
	 * @return			True if the soduku is solvable
	 */
	boolean solve();

	/**
	 * Returns the sudoku board.
	 * 
	 * @return			All the numbers in the sudoku.
	 */
	int[][] getNumbers();

	/**
	 * Assigns all the digits in the matrix numbers to the sudoku.
	 * 
	 * @param			An int-matrix
	 * @throws IllegalArgumentException if not all numbers in [0..9]
	 **/
	void setNumbers(int[][] numbers);
}