import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(order.equals("push")) {
				int num  = Integer.parseInt(st.nextToken());
				stack.push(num);
			}else if(order.equals("pop")) {
				if(stack.size() == 0 ) {
					System.out.println(-1);
				}else {					
					System.out.println(stack.pop());
				}					
			}else if(order.equals("size")) {
				System.out.println(stack.size());
			}else if(order.equals("empty")) {
				if(stack.size() == 0) {
					System.out.println(1);
				}else System.out.println(0);
			}else if(order.equals("top")) {
				if(stack.size() == 0) {
					System.out.println(-1);
				}else {		
				System.out.println(stack.peek());
				}
			}
			
		}
	}	
}