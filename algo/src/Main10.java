import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main10 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		
		for(int i = 0; i< n; i++) {
			if(arr[i] < x) answer.add(arr[i]); 
		}
		
		for(int ans : answer) {
			System.out.print(ans + " ");
		}
		   		   
	}
}	
