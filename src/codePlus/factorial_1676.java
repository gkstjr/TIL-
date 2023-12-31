package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

	
public class factorial_1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int count = 0 ;
		
		
		while(num >= 5) {
			count += num / 5;
			num /= 5;
			
		}
		System.out.println(count);
	}
}
