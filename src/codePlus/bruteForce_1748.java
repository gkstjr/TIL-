package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//1부터 n 까지 * 10씩 해서 반복문 작성하기 반복문마다 해당 시작  (end - ㅑ + 1) * cnt 
// int end = i * 10 - 1
// cnt 는 각 반복문마다 + 1씩 ; 초기값 0;
public class bruteForce_1748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int ans = 0;
		for(int i = 1; i <= n; i*= 10) {
			cnt += 1;
			int end = i * 10 - 1;
			
			if(end > n) { //각 자릿수의 끝자리보다 n값이 작을때는 n을 end로 해주기
				end = n;
			}
			
			ans+= (end - i + 1) * cnt;
			
		}
		System.out.println(ans);
	}
}
