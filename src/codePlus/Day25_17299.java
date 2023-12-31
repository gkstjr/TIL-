package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Day25_17299 {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		int[] freq = new int[1000001];
		int[] ngf = new int[N];
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			freq[arr[i]] += 1;
		}
		
		Stack<Integer> stk = new Stack<Integer>();
		
		stk.push(0);
		
		for(int i = 1 ; i < N; i++) {
			if(stk.isEmpty()) {
				stk.push(i);
				continue;
			}
			while(!stk.isEmpty() && freq[arr[stk.peek()]] < freq[arr[i]]) {
				ngf[stk.pop()] = arr[i];
			}
			stk.push(i);
		}
		
		while(!stk.isEmpty()) {
			ngf[stk.pop()] = -1;
		}
		StringBuilder sb = new StringBuilder();
		for(int n : ngf) {
			sb.append(n + " ");
		}
		System.out.println(sb);
	}
}
