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
public class bruteForce_10973 { 
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] ans = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			ans[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		if(prevPermutation(ans)) {
			for(int i= 0 ; i < n; i++) {
				sb.append(ans[i]).append(" ");
			}
			
		}else {
			sb.append("-1");
		}
		System.out.println(sb);
		
	}
	
	static boolean prevPermutation(int a[]) {
		int i = a.length - 1;
		
		while(i > 0 && a[i] >= a[i - 1]) { // 오른쪽에서부터 내림차순이 되기까지의 위치 찾기
			i -= 1;
		}
		
		if(i <= 0) {
			return false;
		}
		
		int j = a.length - 1;
		
		while(i < j && a[i - 1] < a[j]) {
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
			
			i +=1; j-=1;
		}
		
		
		return true;
	}
	
	
}
