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


public class Main19 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String s = br.readLine();
		
		for(int i =0 ; i< s.length(); i++	 ) {
			char ch = s.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;				
			}
		}
		
		for(int x : arr) {
			System.out.print(x +" ");
		}
	}
}	
