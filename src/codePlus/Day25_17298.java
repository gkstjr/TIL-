package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Day25_17298 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		int nge[] = new int[N];
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(0);
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < N; i++) {
			if(stk.isEmpty()) {
				stk.push(i);
				continue;
			}
			while(!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
				nge[stk.pop()] = arr[i];
			}
			
			stk.push(i);
		}
		
		while(!stk.isEmpty()) {
			nge[stk.pop()] = -1;
		}
		
		for(int num : nge) {
			sb.append(num + " ");
		}
		System.out.println(sb);
 	}
}
