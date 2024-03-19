import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] arr = t.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(i + p.length() > arr.length) break;
            
            String str = "";
            for(int j = i; j < i + p.length(); j++) {
                str += arr[j];                 
            }
            //System.out.println(str);
            if(Long.valueOf(str) <= Long.valueOf(p)) answer++;
        }
        return answer;
    }
}
