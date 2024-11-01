package programmers.book.backTracking;
import java.util.*;

public class back_basic2 {
	static int[][] board = {{1,2,3,4,5,6,7,8,9},
							{4,5,6,7,8,9,1,2,3},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0}
							};
	public static void main(String[] args) {
		solution();
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + ",");
			}
			System.out.println();
		}
	} 

	
	public static boolean solution() {	
		Block block = findEmpty();
		if(block == null) return true;
		
		int row = block.row;
		int col = block.col;
		
		for(int i = 1; i < 10; i++) {
			if(isValid(row , col , i)) {
				board[row][col] = i;
				
				if(solution()) {
					return true;
				}
				
				board[row][col] = 0;
			}
		}
		return false;
	}
	
	
	private static boolean isValid(int row, int col, int i) {
		return !(isTree(row,col,i) || isRow(row,i) || isCol(col, i));
	}
	
	private static boolean isRow(int row, int i) {
		for(int x = 0; x < 9; x++) {
			if(board[row][x] == i) return true;
		}
		
		return false;
	}
	
	private static boolean isCol(int col , int i) {
		for(int x = 0;  x < 9; x++) {
			if(board[x][col] == i) return true;
		}
		
		return false;
	}

	private static boolean isTree(int row , int col , int i) {
		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;
		
		for(int x = startRow; x < startRow + 3; x++) {
			for(int y = startCol; y < startCol + 3; y++) {
				if(board[x][y] == i) return true;
			}
		}
		return false;
	}
	
	
	public static Block findEmpty() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(board[i][j] == 0) {
					return new Block(i,j);
				}
			}
		}
		return null;
	}
	
	
	private static class Block {
		int row , col;
		
		public Block(int row , int col) {
			this.row = row;
			this.col = col;
		}
	}
}
