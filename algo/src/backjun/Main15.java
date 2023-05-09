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


public class Main15 {
	
	public static int d(int n)	{
		int sum = n;
		
		while(n != 0) {
			sum = sum + (n % 10);
			n /= 10;
		}
		
		
				
		return sum;
	}
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		boolean[] arr = new boolean[10001];
		
		for(int i =1; i<= 10000; i++) {
			int n = d(i);
			
			if(n < 10000) {
				arr[n]	= true;		
			}
		}
		
		for(int i =1; i<10000; i++ ) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
		
	}
}	
