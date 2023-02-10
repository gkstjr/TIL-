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


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i =0; i<n; i++) {
			st  = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int[] arr = new int[first];
			double sum = 0;
			for(int j =0; j<first; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double cnt = 0;
			double avg = sum / (double)first;
			
			for(int j=0; j<first; j++) {
				if(arr[j] > avg) cnt++;
			}
			System.out.printf("%.3f%%\n",(cnt /first) *100);
		}
		br.close();
	}
}	
