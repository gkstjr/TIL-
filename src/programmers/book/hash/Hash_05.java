package programmers.book.hash;
import java.util.*;

public class Hash_05 {
	public static void main(String[] args) {
	}

	   public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        HashMap<String , ArrayList<String>> map = new HashMap<>();
	                HashMap<String , Integer> answerMap = new HashMap<>();

	        for(int i = 0 ; i < report.length; i++) {
	            String[] str = report[i].split(" ");
	            
	            if(!map.containsKey(str[1])) {
	                map.put(str[1] , new ArrayList<>());
	            }
	            
	            if(!map.get(str[1]).contains(str[0])) {
	                map.get(str[1]).add(str[0]);            
	            }
	        }
	        
	        for(String key : map.keySet()) {
	            ArrayList<String> list = map.get(key);
	            if(list.size() >= k) {
	                for(String str : list) {
	                    answerMap.put(str , answerMap.getOrDefault(str , 0) + 1); 
	                }
	            }
	        }
	        
	        for(int i = 0 ; i < id_list.length; i++) {
	            answer[i] = answerMap.getOrDefault(id_list[i],0);
	        }
	        return answer;
	    }
	
}
