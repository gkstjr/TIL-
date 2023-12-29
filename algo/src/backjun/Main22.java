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


public class Main22 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[] arr = new int[26];
		String str = br.readLine();
				
		for(int i = 0; i < arr.length; i++) {
			if(i >=('A' - 'A') && i <= ('C' - 'A')) {
				arr[i] = 3;
			}else if(i >= 3 && i <=5) arr[i] = 4;
			else if(i >= 6 && i <=8) arr[i] = 5;
			else if(i >= 9 && i <=11) arr[i] = 6;
			else if(i >= 12 && i <=14) arr[i] = 7;
			else if(i >= 15 && i <=18) arr[i] = 8;
			else if(i >= 19 && i <=21) arr[i] = 9;
			else if(i >= 22 && i <=25) arr[i] = 10;
			
			
		}
			int sum =0;
		for(int i =0;i<str.length();i++) {
			sum += arr[(str.charAt(i)-'A')];
		}
		
		System.out.println(sum);
	}
}	
