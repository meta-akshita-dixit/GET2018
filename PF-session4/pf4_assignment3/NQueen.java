package pf4_assignment3;

public class NQueen {
	
	/**
	 * this is a recursive method that finds the arrangement of n queens in a nxn board.
	 * @param board
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return
	 */
	boolean nQueen(int[][] board, int startRow, int dimensionOfMatrix){
		boolean check = false;                                            //variable to tell the status of board
		for(int i = 0; i < dimensionOfMatrix; i++)                        //to check for all columns in the passed row
		{
			if(startRow >= dimensionOfMatrix)
				return true;
			if(safeState(board, startRow, i, dimensionOfMatrix))          //to check if this particular position is safe or not
			{
				board[startRow][i] = 1;                                   //place queen at  that position
				check = nQueen(board, startRow + 1, dimensionOfMatrix);   //recursive call for next row
				if(check)                                       
					return check;
				
			}
			 board[startRow][i] = 0;
				
			}
		return check;
	}
	/**
	 * this method checks if the board is in safe state for the position this is passed as startrow and col
	 * @param board
	 * @param startRow
	 * @param col
	 * @param dimensionOfMatrix
	 * @return
	 */
	boolean safeState(int[][] board, int startRow, int col, int dimensionOfMatrix){
		
		boolean check = true;                                             //to check if there is conflict 
		for(int i = 0; i < dimensionOfMatrix; i++)                        //to check conflicts in all possible directions
		{
			if(board[i][col] == 1)              
				                                                          //checking conflicts in row and column 
			{
				check = false;
				break;
			}
			if((col - i) >= 0 && (startRow - i) >= 0 && board[startRow - i][col - i] == 1 ) 
				                                                          //checking conflict in top right diagonal
			{
				check = false;
				break;
			}
			if((col + i) < dimensionOfMatrix && (startRow - i) >= 0 && board[startRow - i][col + i] == 1 )
				                                                        //checking conflict in top left diagonal
			{
				check = false;
				break;
			}
		}
		
		return check;
   
   }
	int[][] boardStatus(int[][] board){
		
		nQueen(board, 0, board.length);
		return board;
	}
}

