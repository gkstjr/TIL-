package backjun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main36 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int answer = search(N);
		System.out.println(answer);
	}
	
	
	
	private static int search(int N) {
		int sum = N;
		int count = 0;
		
		while(true) {
			if(sum % 5 !=0 && sum % 3 != 0) {
				sum -= 5 ;
				count++;
			}else if(sum % 5 == 0) {
				sum -= 5;
				count++;
			}else if(sum % 3 == 0) {
				sum -= 3;
				count++;
			}
			
			if(sum == 0) {
				break;
			}else if(sum < 0) {
				count = -1;
				break;
			}
			
		}
		
		return count;
	}
}	
