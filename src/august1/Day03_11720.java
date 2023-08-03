package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Day03_11720 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0 ;
		for(byte bt : br.readLine().getBytes()) {
			sum += (bt - '0');
			System.out.println(bt - 48);
		}
		
		System.out.println(sum);
	}
}
