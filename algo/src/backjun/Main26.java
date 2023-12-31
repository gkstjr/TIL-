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


public class Main26 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[n1][n2];
		int[][] B = new int[n1][n2];
		
		for(int i =0 ;i<n1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n2; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i =0 ;i<n1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n2; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i =0 ;i<n1; i++) {
			for(int j=0; j<n2; j++) {
				A[i][j] = A[i][j] + B[i][j];
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}	
