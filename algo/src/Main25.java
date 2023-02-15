import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main25 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 2;
		
		if(n == 1) {
			System.out.print(1);
		}
		else {
			
		while(n >= range) {
			range = range + (6 * cnt);
			cnt++;
			
		}
		System.out.println(cnt);
		}
	}
}	
