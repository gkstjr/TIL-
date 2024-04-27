package colombus.week1;

import java.io.*;
import java.util.StringTokenizer;
public class day3_basic {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int cnt = 0;
		for(int i = 0 ; i <= N; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0 ; k < 60; k++) { 
					if( i % 10 == K || i / 10 == K || j % 10 == K || j / 10 == K || k % 10 == K || k / 10 == K ) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}