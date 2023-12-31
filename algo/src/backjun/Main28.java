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


public class Main28 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		
		int[][] box = new int[100][100];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j = y ; j<y+10; j++) {
				for(int k = x; k < x + 10; k++) {
					box[j][k] = 1;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i< box.length; i++) {
			for(int j = 0; j<box[i].length; j++) {
				sum += box[i][j];
			}
		}
		System.out.println(sum);
	}
}	
