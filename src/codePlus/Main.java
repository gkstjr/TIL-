package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 인프런 rest API 강의 완료 - > 간단하게 머리 식히기용으로 듣기 좋았음 코드플러스 2/2 문제 내일 부터 시작
public class Main {
	static int n;
	static String[][] bom;
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		bom = new String[51][51];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
				bom[i] = str.split("");
		}
		for(int i = 0 ; i < n; i++) {
			for(int j = 0 ; j < n; j++) {
				if(i + 1 < n) {
					if(!bom[i][j].equals(bom[i + 1][j])) {
						String tmp = bom[i][j];bom[i][j] = bom[i + 1][j];bom[i + 1][j] = tmp;
						int temp = check(bom);
						if(ans < temp) ans = temp;
						String tmp2 = bom[i][j];bom[i][j] = bom[i + 1][j];bom[i + 1][j] = tmp2;
					} 
				}
				if(j + 1 < n) {
					if(!bom[i][j].equals(bom[i][j + 1])) {
						String tmp = bom[i][j];bom[i][j] = bom[i][j + 1];bom[i][j + 1] = tmp;
						int temp = check(bom);
						if(ans < temp) ans = temp;
						String tmp2 = bom[i][j];bom[i][j] = bom[i][j + 1];bom[i][j + 1] = tmp2;
					} 
				}
					
			}
		}
		System.out.println(ans);
	}
	
	static int check(String[][] str) {
		
		int ans  = 0;
		for(int i = 0 ; i < n; i++) {
			int cnt = 1;
			//행비교
			for(int j = 1 ; j < n; j++) {
				if(bom[i][j].equals(bom[i][j - 1])) {
					cnt += 1;
				}
				
			}
			if(ans < cnt) ans = cnt;
			cnt = 1;
			//열비교
			for(int j = 1; j < n; j++) {
				if(bom[j][i].equals(bom[j - 1][i])) {
					cnt += 1;
				}
			}
			if(ans < cnt) ans = cnt;
		}
		
		return ans;
	}

}
