package programmers.book.queue;
import java.util.*;

public class Queue_03 {
	public static void main(String[] args) {
		
		
	}

	 public String solution(String[] cards1, String[] cards2, String[] goal) {
	        Queue<String> que1 = new ArrayDeque<String>();
	        Queue<String> que2 = new ArrayDeque<String>();
	        Queue<String> que3 = new ArrayDeque<String>();
	        boolean isPass = false; // 이전이 패스였으면 true임
	        
	        for(int i = 0 ; i < cards1.length; i++) {
	            que1.offer(cards1[i]);
	        }
	        for(int i = 0 ; i < cards2.length; i++) {
	            que2.offer(cards2[i]);
	        }
	        for(int i = 0 ; i < goal.length; i++) {
	            que3.offer(goal[i]);
	        }
	        
	        while(!que3.isEmpty()) {
	            if(!que1.isEmpty() && que1.peek().equals(que3.peek())) {
	               // System.out.println("que1 = " + que1.peek());
	                que1.poll();
	                que3.poll();
	                continue;
	            }else if(!que2.isEmpty() && que2.peek().equals(que3.peek())) {
	                //System.out.println("que2 = " + que2.peek());
	                que2.poll();
	                que3.poll();
	                continue;
	            }
	           
	            return "No";
	        }
	        
	        return "Yes";
	    }
}
