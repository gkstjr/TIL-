package programmers.book.stacks;
import java.util.*;

public class stack_03 {
	public static void main(String[] args) {
		
		
	}

	 public int solution(String s) {
	        int answer = 0;
	  
	        char[] ch = s.toCharArray();
	        ArrayList<Character> arr = new ArrayList<Character>();
	        
	        for(char c : ch) {
	            arr.add(c);
	        }
	        Stack<Character> stk = new Stack<Character>(); 
	       
	        Loop1 :
	        for(int i = 0 ; i < s.length(); i++) {
	            char first = arr.get(0);
	            for(int j = 0; j < s.length(); j++) { 
	                char a = arr.get(j);
	                if(a == '[') stk.push('[');
	                else if(a == '{') stk.push('{');
	                else if(a == '(') stk.push('(');
	                else if(a == ']') {
	                    if(stk.isEmpty() || stk.peek() != '[') {
	                        arr.remove(0);
	                        arr.add(first);
	                        continue Loop1;    
	                    }else stk.pop();
	                }else if(a == '}') {
	                    if(stk.isEmpty() || stk.peek() != '{') {
	                        arr.remove(0);
	                        arr.add(first);
	                        continue Loop1;    
	                    }else stk.pop();
	                }else if(a == ')') {
	                     if(stk.isEmpty() || stk.peek() != '(') {
	                        arr.remove(0);
	                        arr.add(first);
	                        continue Loop1;    
	                    }else stk.pop();
	                }
	            }
	            if(stk.isEmpty()) answer++;
	            stk.clear(); 
	            arr.remove(0); arr.add(first);
	        }
	        return answer;
	    }
}
