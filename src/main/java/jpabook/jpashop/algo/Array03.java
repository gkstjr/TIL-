package main.java.jpabook.jpashop.algo;
import java.util.*;
public class Array03 {
    public static void main(String[] args) {
    		
    }

    public int[] solution(int[] answers) {
        int[][] answer = {{1,2,3,4,5},
                          {2,1,2,3,2,4,2,5},
                          {3,3,1,1,2,2,4,4,5,5}};
        int a = 0; int b = 0; int c =0;
        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            
            if(answer[0][i % 5] == ans) a++;
            if(answer[1][i % 8] == ans) b++;
            if(answer[2][i % 10] == ans) c++;
        }
        int[] ans = {a , b ,c};
        Arrays.sort(ans);
        
        return ans;
    }
}
