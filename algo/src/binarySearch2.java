
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class binarySearch2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
		}
		System.out.println(sb);
	}
	// 하한 인덱스 구하기
	public static int lowerBound(int[] arr , int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key <= arr[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	
	//상한 인덱스 쿠하기
	public static int upperBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}