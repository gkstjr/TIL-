import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main38 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int average =  average(arr);
		int middle = middle(arr);
		
		System.out.println(average);
		System.out.println(middle);
	}

	private static int middle(int[] arr) {
		Arrays.sort(arr);
		return arr[2];
	}

	private static int average(int[] arr) {
		int sum =0;
		for(int i = 0 ; i <arr.length; i++) {
			sum += arr[i];
		}
		 
		return sum / arr.length;
	}	
}