package programmers.book.hash;
import java.util.*;

public class Hash_03 {
	public static void main(String[] args) {
	}

	class Solution {
	    public int solution(String[] want, int[] number, String[] discount) {
	        int answer = 0;
	        HashMap<String, Integer> map = new HashMap<String,Integer>();
	        
	        for(int i = 0 ; i < want.length; i++) {
	            map.put(want[i] , number[i]);                
	        }

	        for(int i = 0 ; i < discount.length - 9; i++) {
	            HashMap<String, Integer> map1 = new HashMap<>(map); 
	            Loop1:
	            for(int j = i ; j < i + 10; j++) {
	                String str = discount[j];
	                if(map1.containsKey(str)) {
	                    map1.put(str , map1.get(str) - 1);
	                    //System.out.println(str + " " + map1.get(str) + " i = " + i);
	                    if(map1.get(str) == 0) map1.remove(str);
	                }else {
	                    break Loop1;
	                }
	            }
	            if(map1.isEmpty()) {
	                //System.out.println("i = " + i);
	                answer++;  
	            } 
	        }
	        return answer;
	    }
}
}
