package colombus;

import java.io.*;
import java.util.StringTokenizer;
public class day2_basic {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int cnt = 1;
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int sum = 0;
		int answer = 0;
		for(int i = 0 ; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					sum += arr[i] + arr[j] + arr[k];
					if(sum <= M && answer < sum) {
						answer = sum;
					}
					sum = 0;
				}
			}
		}
		
		System.out.println(answer);
	}
	
}