package programmers.book.sort;
import java.util.*;

public class Sort_05 {
	public static void main(String[] args) {
		solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
	}
	   public static int[] solution(String s) {
	        int[] answer;
	        
	        String[] arr = s.split("");
	        Stack<String> stk = new Stack<String>();
	        
	        HashMap<Integer,Integer> map = new HashMap<>();
	      
	        
	        String preStr = "";
	        for(int i = 1 ; i < arr.length - 1; i++) {
	            String str = arr[i];
	            System.out.println(str);
	            if(str.equals("{")) {
	                stk.push("{");
	                continue;  
	            } 
	            if(str.equals("}")) {
	                map.put(Integer.valueOf(preStr),map.getOrDefault(Integer.valueOf(preStr),0) + 1);    
	                preStr = "";
	                stk.pop();
	                continue;
	            }
	            if(str.equals(",")) {
	               if(stk.isEmpty()) continue;
	               map.put(Integer.valueOf(preStr),map.getOrDefault(Integer.valueOf(preStr),0) + 1);    
	               preStr = "";
	               continue;
	            }
	            
	            preStr += str;
	        }
	        
	        answer = new int[map.size()];
	        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
	        for(Map.Entry<Integer,Integer> entry : entryList) {
	            System.out.println(entry.getKey() + " / " + entry.getValue());
	        }
	        
	        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

	        int i = 0;
	        for(Map.Entry<Integer,Integer> entry : entryList) {
	            answer[i] = entry.getKey();
	            i++;
	        }
	        return answer;
	    }

}
