package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 0 부터 1000000 까지  브루트 포스방식으로 해당 채널이 버튼으로 이동가능한 지 검사 후 버튼누른 횟수 + "+ -" 누르는 횟수가 최솟값인 값 구하기
public class bruteForce_1107 {
	static boolean[] bool;
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		int M = Integer.parseInt(br.readLine());
		
		bool = new boolean[10]; // true 면 고장
		
		if(M > 0) {
			st = new StringTokenizer(br.readLine());
		
			for(int i = 0; i < M; i++) {
				int num = Integer.parseInt(st.nextToken());
				bool[num] = true; 
			}
		}
		
		int ans = N - 100;
		if(ans < 0) {
			ans = -ans;
		}
		
		int c = 0;//숫자버튼으로 눌러 이동하려는 채널
		for(int i = 0; i <= 1000000; i++) {
			c = i;
			int len = check(c); // 숫자버튼 이동 가능할 때 버튼 누른 횟수
			
			if(len > 0) { // 숫자버튼으로 이동 가능일 때
				int cnt = c - N;
				cnt = Math.abs(cnt);
				if(ans > cnt + len) ans = cnt + len;
			}
		}
		
		System.out.println(ans);
	}
	
	static int check(int c) {// 해당 채널에 숫자버튼으로 이동가능한지 확인 후 누른 버튼 횟수 반환 
		if(c == 0) { // 이동하려는 채널이 0일 때
			if(bool[c] == true) { //0번 버튼이 고장났을 시
				return 0;
			}else {
				return 1;
			}
		}
		
		int cnt = 0;
		
		while(c > 0) {
			int num = c % 10;
			if(bool[num]) {
				return 0;
			}else {
				cnt++;
				c = c / 10;
			}
			
		}
		return cnt;
	}
}
