package programmers.book.ziphop;
import java.util.*;

public class ziphop_02 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String ,Integer> map = new HashMap<String ,Integer>();
        int humanNum = 1;
        int turn = 1;
        char ch = words[0].charAt(0);
        
        for(int i = 0 ; i < words.length; i++) {
            if(humanNum > n) {
                humanNum = 1;
                turn++;
            }
            String str = words[i];
            if(ch != str.charAt(0)) {
                answer[0] = humanNum; answer[1] = turn;
                break;
            }
            if(map.containsKey(str)) {
                answer[0] = humanNum; answer[1] = turn;
                break;
            }else map.put(str , 1);
            
            ch = str.charAt(str.length() - 1);
            humanNum++;
        }
        return answer;
    } 
}
