package programmers.book.stacks;
import java.util.*;

public class stack_03 {
	public static void main(String[] args) {
		
		
	}

	 public int solution(String s)
	    {
	        int answer = -1;
	        
	        char[] ch = s.toCharArray();
	        Stack<Character> stk = new Stack();
	        
	        for(int i = 0 ; i < ch.length; i++) {
	            char c = ch[i];
	            
	            if(!stk.isEmpty() && stk.peek() == c) {
	                stk.pop();
	            }else stk.push(c);
	        }

	        return stk.isEmpty() ? 1 : 0;
	    }
}
