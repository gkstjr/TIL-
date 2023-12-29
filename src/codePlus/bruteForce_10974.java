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
public class bruteForce_10974 { 
	static StringBuilder sb;
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n  = Integer.parseInt(br.readLine());
		
		int[] ans = new int[n];
		
		sb = new StringBuilder();
		for(int i = 0 ; i < n; i++) {
			ans[i] = i + 1;
			sb.append(ans[i]).append(" ");
		}
		sb.append("\n");
		
		
		nextPermutation(ans);
		
		System.out.println(sb);
		
	}
	
	//다음 수열 있으면  true 반환하면서 출력해주는 함수 없으면 false
	static boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		
		while(i > 0 && a[i - 1] > a[i]) {
			i -= 1;
		}
		
		if(i <= 0) {
			return false;
		}
		
		int j = a.length - 1;
		
		while(i < j && a[i - 1] > a[j]) {
			j -= 1;
		}
		
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		
		j = a.length - 1;
		while(i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i+= 1; j -=1;
		}
		
		
		for(int k = 0; k < a.length; k++) {
			sb.append(a[k]).append(" ");
		}
		sb.append("\n");
		
		
		return nextPermutation(a);
	}
}
