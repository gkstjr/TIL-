package programmers.book.stacks;
import java.util.*;

public class stack_01 {
	public static void main(String[] args) {
		
	}

	  boolean solution(String s) {
	        boolean answer = true;

	        Stack<Character> stk = new Stack<Character>();
	        
	        char[] a = s.toCharArray();
	        
	        for(int i = 0; i < a.length; i++) {
	            if(a[i] == ')') {
	                if(stk.isEmpty()) return false;
	                stk.pop();
	            }else {
	                stk.push('(');
	            }
	        }
	            
	        return stk.empty();
	    }
}
