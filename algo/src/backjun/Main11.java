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


public class Main11 { // 복습1
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n =9;
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(arr[i], max);
		}
		
		for(int i =0; i<n; i++) {
			if(arr[i] == max) cnt = i+1; 
		}
		bw.write(max + "\n" +cnt);
		
		bw.flush();
		bw.close();
	
		
			
	}
}	
