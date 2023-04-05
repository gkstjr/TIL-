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


public class Main39 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		
		int[][] arr = new int[9][9];
		int row =0;
		int col =0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = i + 1;
					col = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
	}
}	
