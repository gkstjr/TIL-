package colombus.week1;

import java.io.*;
import java.util.StringTokenizer;
public class day1_basic {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int[] num = new int[N + 1];
		
		if(N != 0)  num[1] = 1;
		
		for(int i = 2 ; i <= N; i++ ) {
			num[i] = num[i - 1] + num[i - 2];
		}
		
		System.out.println(num[N]);
		
	}
}
