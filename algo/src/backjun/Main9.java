package backjun;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main9 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			Scanner sc = new Scanner(System.in);
			
		   int n = sc.nextInt();
		   int[] arr = new int[n];
		   int cnt = 0;
		   for(int i = 0; i < n; i++) {
			   arr[i] = sc.nextInt();
		   }
		   int v = sc.nextInt();
		   for(int i = 0; i < n; i++) {
			   if(arr[i] == v) cnt ++;
		   }
		   System.out.println(cnt);
		   		   
	}
}	
