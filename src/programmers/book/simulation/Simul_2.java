package programmers.book.simulation;
import java.util.*;

public class Simul_2 {
	 public int solution(int[] topping) {
	        int answer = 0;
	        HashMap<Integer,Integer> firstR = new HashMap<Integer,Integer>();
	        HashSet<Integer> set = new HashSet<Integer>();
	        
	        for(int i = 0; i < topping.length; i++) {
	            firstR.put(topping[i] , firstR.getOrDefault(topping[i] , 0) + 1);
	        }
	        
	        for(int i = 0 ; i < topping.length; i++) {
	            set.add(topping[i]);
	            
	            if(firstR.containsKey(topping[i])) {
	                if(firstR.get(topping[i]) == 1) firstR.remove(topping[i]);
	                else firstR.put(topping[i] , firstR.get(topping[i]) - 1);
	            }
	            
	            if(set.size() == firstR.size()) answer++;
	        }        
	  
	        return answer;
	    }
}
