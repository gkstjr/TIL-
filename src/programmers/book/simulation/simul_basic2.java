package programmers.book.simulation;
import java.util.*;

public class simul_basic2 {
	public static void main(String[] args) {
//		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] matrix2 = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] matrix1 = {{2,4,6},{1,3,5},{7,8,9}};
		int[][] matrix2 = {{9,1,2},{4,5,6},{7,3,8}};
		
		int[][] answer = new int[3][3];
		for(int i = 0; i < matrix1.length; i++) {
			for(int j = 0 ; j < matrix1.length; j++) {
				answer[i][j] += matrix1[i][0] * matrix2[0][j];
				answer[i][j] += matrix1[i][1] * matrix2[1][j];
				answer[i][j] += matrix1[i][2] * matrix2[2][j];
			}
		}
		int[][] answer2 = new int[3][3];
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				answer2[i][j] = answer[j][i];
			}
		}
		
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				System.out.print(answer2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
