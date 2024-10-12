package programmers.book.hash;
import java.util.*;

public class Hash_04 {
	public static void main(String[] args) {
	}

	class Solution {
	    public String[] solution(String[] record) {
	        ArrayList<String> answer = new ArrayList<String>(); 
	        
	        HashMap<String, String> map = new HashMap<String, String>();
	        
	        for(String str : record) {
	            String[] split = str.split(" ");
	            if(split[0].equals("Enter") || split[0].equals("Change")) {
	                map.put(split[1],split[2]);
	            }
	        }
	        
	        for(String str : record) {
	            String[] split = str.split(" ");
	            if(split[0].equals("Enter")) {
	                answer.add(map.get(split[1]) + "님이 들어왔습니다.");
	            }else if(split[0].equals("Leave")) {
	                answer.add(map.get(split[1]) + "님이 나갔습니다.");
	            }
	        }
	      
	        return answer.toArray(new String[0]);
	    }
	}
}
