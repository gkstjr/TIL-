import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main34 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());

		int answer = search(n);
		System.out.println(answer);
		
	}
	
	private static int search(int n) {
		int answer = 0;
		for(int i =0 ; i < n; i++) {
			int sum = 0;
			int num = i;
			
			while(num != 0) {
				sum += num%10;
				num /= 10;
			}
			
			if(sum + i == n) {
				answer = i;
				break;
			}
		}
		 return answer;
	}

}	
