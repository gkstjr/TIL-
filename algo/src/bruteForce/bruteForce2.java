package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class bruteForce2 {
	
		public static int[] arr;
		public static int count = 0;
		public static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		//배열의 인덱스가 열 값 , 열 인덱스 배열 정수 값이 행
		
		nQueen(0);
		System.out.println(count);
		
		
	}
	// 해당 열에 퀸을 놓는 함수(재귀 함수이니 언제 빠져날가지 조건 먼저 주기)
	public static void nQueen(int depth) {
		if(N == depth) {
			count++;
			return;
		}
		// 해당 열(depth)에 어떤 행에 퀸을 놓을지 반복문 돌리기
		for(int i = 0; i < N; i++) {
			arr[depth] = i;
			//해당 열(depth)에서 행(i) 가 퀸을 놓을 수 있는지 조건문으로 true false판별
			if(Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}
	
	public static boolean Possibility(int col) {
		
		for(int i = 0 ; i < col; i++) {
			//호출 된 열의 행과 i열의 행이 일치할 경우 퀸을 못놓음 (같은 행에 존재하기 떄문)
			if(arr[col] == arr[i]) {
				return false;
			}else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) { //열의 차와 행의 차가 같을 경우 대각선에 놓여있는 것임
				return false;
			}
		}
		return true;
	}
}