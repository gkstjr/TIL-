package programmers.book.simulation;
import java.util.*;

public class simul_basic1 {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int M = arr.length;
		int N = 2;
		
		int[][] answer = new int[M][M];

		for(int k = 0 ; k < N; k++) {
			answer = new int[M][M];

			for(int i = 0 ; i < M ; i++) {
				for(int j = 0 ; j < M; j++) {
					answer[j][M - i - 1] = arr[i][j];
				}
			}
			
			arr = answer;
		}
		
		System.out.println("====================");
		for(int i = 0; i < M ; i++) {
			for(int j = 0 ; j < M; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
