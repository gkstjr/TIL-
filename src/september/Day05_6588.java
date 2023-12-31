package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day05_6588 {
	static int n;
	static boolean[] arr = new boolean[1000001]; 
	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 is_prime(arr);
		 StringBuilder sb = new StringBuilder();
		 while((n = Integer.parseInt(br.readLine())) != 0) {
			 			 
			 boolean isProve = false;
			 
			 for(int i = 2; i <= n / 2; i++) {
				 if(!arr[i] && !arr[n - i]) {
					 sb.append(n + " = " + i + " + " + (n - i)).append("\n");
					 isProve = true;
					 break;
				 }
			 }
			 
			 if(!isProve) {
				 sb.append("Goldbach's conjecture is wrong.").append("\n");
			 }
		 }
		 
		 System.out.println(sb);
	}
	
	static void is_prime(boolean[] arr) {
		
		arr[0] = arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(1000001); i++) {
			
			if(arr[i] == true) {
				continue;
			}
			
			for(int j = i + i; j < 1000001; j+= i) {
				arr[j] = true;
			}
		}
	}
}
