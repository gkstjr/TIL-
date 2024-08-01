package programmers.book.stacks;
import java.util.*;

public class stack_02 {
	public static void main(String[] args) {
		
		System.out.println(solution(12345));
		
	}

	public static String solution(int number) {
		Stack<Integer> stk = new Stack<Integer>();
		while(number != 0) {
			int mod = number % 2;
		//	System.out.println(mod);

			stk.push(mod);
			number /= 2;  
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stk.isEmpty()) {
			//System.out.println(stk.peek());
			sb.append(stk.pop());
		}
		return sb.toString();
	}
}
