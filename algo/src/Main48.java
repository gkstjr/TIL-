import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
 
public class Main48 {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] origin = new int[n];
		int[] sorted = new int[n];
		for(int i = 0; i < n; i++) {
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();
		Arrays.sort(sorted);	
		int rank = 0;
		
		for(int v : sorted) {
			if(!answer.containsKey(v)) {
				answer.put(v, rank);
				rank++;
			}
		}
		
		for(int i = 0 ; i < n; i++) {
			System.out.print(answer.get(origin[i]) + " ");
		}
	}
}