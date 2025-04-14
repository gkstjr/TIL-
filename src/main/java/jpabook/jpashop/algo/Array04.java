package main.java.jpabook.jpashop.algo;
import java.util.*;
public class Array04 {
    public static void main(String[] args) {
    		
    }

    public int[] solution(int[] answers) {
        int[][] answer = {{1,2,3,4,5},
                          {2,1,2,3,2,4,2,5},
                          {3,3,1,1,2,2,4,4,5,5}};

        int[] ans = new int[4];
            
        for(int i = 0; i < answers.length; i++) {
            int tmp = answers[i];
            
            if(answer[0][i % 5] == tmp) ans[1] = ans[1] + 1;
            if(answer[1][i % 8] == tmp) ans[2] = ans[2] + 1;
            if(answer[2][i % 10] == tmp) ans[3] = ans[3] + 1;
        }
        
        
        int max = Math.max(ans[1],Math.max(ans[2],ans[3]));
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == ans[1]) list.add(1);
        if(max == ans[2]) list.add(2);
        if(max == ans[3]) list.add(3);        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
