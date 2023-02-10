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


public class Main12 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[31];
		arr[0] = 1;
//		for(int i = 0; i<31; i++) {
//			arr[i] = 1;
//		}
		
		for(int i =0; i<28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num] = 1;
		}
		
		for(int i =0 ; i<31; i++) {
			if(arr[i] != 1) System.out.println(i);;
		}
		
		
			
	}
}	
