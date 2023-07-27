package backjun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main44 { // ∫π±‚¡ﬂ
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());

		int num = (int)Math.log10(N) + 1;
		Integer[] arr = new Integer[num];
		for(int i =0 ; i< num; i++) {
			arr[i] = N % 10;
			N /= 10;
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i = 0 ; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
	}	
}