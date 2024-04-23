package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class day2_normal {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		int[] answer = new int[N + 1];
		
		for(int i = 0 ; i < N; i++ ) {
			int num = i;
			int sum = i;
			while(num > 0) {
				sum += num % 10;
				num /= 10; 
			}
			
			if(sum == N) {
				answer[sum] = i;
				break;
			}
		}
		
		/*
		for(int i = 0 ; i < N; i++ ) {
			int num = i;
			int sum = i;
			while(num > 0) {
				sum += num % 10;
				num /= 10; 
			}
		가장 작은 생성자를 구하느 건데 문제를 잘 파악하지 않아서 해당 코드로 하게 되면 더 큰 생성자가 있을 시 큰 생성자로 나오게 구현 되어 있음.	
			if(sum > N) break;
			answer[sum] = i;
		}
		*/
		System.out.println(answer[N]);
	}
	
}