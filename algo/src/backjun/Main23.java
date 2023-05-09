package backjun;
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


public class Main23 {
	
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n = Integer.parseInt(br.readLine());
		int cnt  = 0;
		for(int i = 0; i<n; i++) {
			if(check()) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean check() throws IOException {
		
			boolean[] arr = new boolean[26];
			int prv = 0;
			String s = br.readLine();
			for(int i =0; i< s.length(); i++) {
				int now = s.charAt(i);
				if(prv != now) {
					if(arr[now - 'a'] == false) {
						arr[now -'a'] = true;
						prv = now;
					}else {
						return false;
					}
				}
			}
		
		return true;
	}
}	
