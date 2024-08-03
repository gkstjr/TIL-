package programmers.book.stacks;
import java.util.*;

public class stack_05 {
	public static void main(String[] args) {
		Stack<Integer> stc = new Stack<Integer>();
		
		stc.push(1);
		stc.push(3);
		
		System.out.println(stc.isEmpty());
		System.out.println(stc.pop());
		
	}

	    public int[] solution(int[] prices) {
	        Stack<Integer> stk = new Stack<Integer>();

	        int size = prices.length;
	        int[] answer = new int[size];

	        for(int i = 0 ; i < size; i++) {
	            int number = prices[i];
	           if(!stk.isEmpty() && prices[stk.peek()] > number) {
	                while(!stk.isEmpty() && prices[stk.peek()] > number) {
	                    int pop = stk.pop();
	                    answer[pop] = i - pop;
	                }
	            }
	            
	            stk.push(i);    
	        }
	        
	        while(!stk.isEmpty()) {
	            int pop = stk.pop();
	            answer[pop] = size - 1 - pop;
	        }
	        return answer;
	    }
	}

