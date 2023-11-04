package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 0 부터 1000000 까지  브루트 포스방식으로 해당 채널이 버튼으로 이동가능한 지 검사 후 버튼누른 횟수 + "+ -" 누르는 횟수가 최솟값인 값 구하기
public class bruteForce_6064 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int t = 0 ; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			boolean ok = false; // 맞는 해가 있으면 true
			
			for(int i = x; i <= m * n; i+= m) {
				if(((i - 1) % n) + 1 == y) {
					sb.append(i).append("\n");
					ok = true;
					break;
				}
			}
			
			if(!ok) sb.append(-1).append("\n");
		}
		System.out.println(sb);
	}
}
