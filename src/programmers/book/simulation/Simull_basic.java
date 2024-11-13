package programmers.book.simulation;
import java.util.*;

public class Simull_basic {
	public static void main(String[] args) {
		
		int n = 4;
		
		int[][] map = new int[n][n];
		
		int startRow = 0 , endRow = n - 1 , startCol = 0 , endCol = n - 1;
		int cnt = 1;
		while(!(startRow > endRow && startCol > endCol)) {
			
			for(int i = startCol; i <= endCol; i++) {
				map[startRow][i] = cnt++;
			}
			
			startRow++;
			
			for(int i = startRow; i <= endRow; i++) {
				map[i][endCol] = cnt++;
			}
			
			endCol--;
			
			for(int i = endCol; i >= startCol; i--) {
				map[endRow][i] = cnt++;
			}
			
			endRow--;
			
			for(int i = endRow; i>= startRow; i--) {
				map[i][startCol] = cnt++;
			}
			
			startCol++;
		}
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
