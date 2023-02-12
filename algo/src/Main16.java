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


public class Main16 {
	
	public static int Solution(int n)	{
		int cnt = 0;
		
		if(n < 100) {
			return n;
		}
		else {
			cnt = 99;
		for(int i =100; i <= n; i++) {
			int hun = i / 100;
			int ten = (i / 10) % 10;
			int one = i % 10;
			
			if((hun - ten) == (ten - one)) cnt ++;
		}
		
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			
			int answer = Solution(n);
			System.out.println(answer);
	}
	
}	
