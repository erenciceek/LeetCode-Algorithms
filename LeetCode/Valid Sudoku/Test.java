import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();
		

	}
}

class Solution {
	
	
	// runtime : 1ms   , memory : 43.10 mb
	public boolean isValidSudoku(char[][] board) {
		
		boolean[][] rows = new boolean[9][9];
		boolean[][] columns = new boolean[9][9];
		boolean[][] square = new boolean[9][9];		
		
		for (int i = 0; i < board.length ; i++ ) {
			
			for (int j = 0; j < board[i].length ; j++) {
				
				if (board[i][j] == '.')
					continue;
				
				int num = board[i][j];
				
				if (rows[i][num-1] == true)
					return false;
				rows[i][num-1] = true;
				if (columns[j][num-1] == true)
					return false;
				columns[j][num-1] = true;
				
				if (square[(i / 3) * 3 + j/3][num-1] == true)
					return false;
				square[(i / 3) * 3 + j/3][num-1] = true;
			}
		}

		
		return true;
    }
	

   
	
}
