package programmers.book.simulation;
import java.util.*;
import java.util.function.IntBinaryOperator;

public class simul_basic3 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String str = "";
        int zeroCnt = 0;
        int binaryCnt = 0;
        while(!s.equals("1")) {
            for(int i = 0 ; i < s.length(); i++) {
                char ch = s.charAt(i);

                if(ch == '0') {
                    zeroCnt++;
                }
            }
            s = s.replace("0" , "");
            s = Integer.toBinaryString(s.length());
            binaryCnt++;
        }
        answer[1] = zeroCnt;
        answer[0] = binaryCnt;
        return answer;
    }
}
