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


public class Main13 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		
		int n =	Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i =0; i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) max = arr[i];
		}
		double sum = 0;
		for(int i =0; i<n; i++) {
				sum += (double)arr[i] / (double)max * 100;
		}
		double avg = (sum) / n;
		System.out.println(avg);
	}
}	
