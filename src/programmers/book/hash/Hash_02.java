package programmers.book.hash;
import java.util.*;

public class Hash_02 {
	public static void main(String[] args) {
	}

	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String , Integer> map = new HashMap<String , Integer>();
	        
	        for(int i = 0 ; i < completion.length; i++) {
	            if(map.containsKey(completion[i])) {
	                map.put(completion[i], map.get(completion[i]) + 1);
	            }else map.put(completion[i], 1);    
	        }
	        
	        for(String str : participant) {
	            if(map.containsKey(str) && map.get(str) > 1) {
	                map.put(str, map.get(str) - 1);
	                continue;
	            }else if(map.containsKey(str) && map.get(str) == 1) {
	                map.put(str, map.get(str) - 1);
	                continue;
	            }
	            return str;
	        }        
	        return answer;
	    }
}
