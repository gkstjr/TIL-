package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 브루트 포스로 순열 구하기
// prevPurmutation
public class bruteForce_10819 { 
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] ans = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			ans[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ans);
		
		int max = 0;
		do {
			int temp = calculate(ans);			
			max = Math.max(temp, max);
		}while(nextPermutation(ans));
	
		sb.append(max);
		System.out.println(sb);
	}
	
	
	static int calculate(int a[]) {
		int answer = 0;
		for(int i = 1; i <= a.length; i++) {
			answer += Math.abs(a[i] - a[i - 1]);
		}
		
		return answer;
	}

	
	static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		
		while(i > 0 && a[i] <a[i - 1]) {
			i -= 1;
		}
		
		if(i <= 0) {
			return false;
		}
		
		int j = a.length - 1;
		
		while(j > i && a[j] < a[i - 1]) {
			j -= 1;
		}
		
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		
		j = a.length - 1;
		
		while(i <  j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i+= 1; j -=1;
		}
		
		
		
		return true;
	}
	
}
