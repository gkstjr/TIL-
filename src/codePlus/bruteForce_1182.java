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
public class bruteForce_1182 { 
	static int n;
	static int s;
	static int seq[];
	static int cnt = 0;
	static boolean check = false;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		seq = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		recur(0 , 0);
		if(s == 0 ) {
			cnt--;
			System.out.println(cnt);
		}else {
			System.out.println(cnt);
		}
	}
	
	
	static void recur(int index , int sum) {
		if(index >= n) {
			if(sum == s) cnt++;
			return;
		}
		
		//선택했을 때
		
		recur(index + 1 , sum + seq[index]);
		
		//선택안했을때
		recur(index + 1 , sum);
		
		return;
	}
}
