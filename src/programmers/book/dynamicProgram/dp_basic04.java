package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic04 {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        for(int i = 1 ; i < triangle.length; i++) {
            for(int j = 0; j < triangle[i].length; j++) {
                if(j - 1 < 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j] , dp[i - 1][j - 1]) + triangle[i][j];
                // System.out.println("i = " + i + " , j = " + j + " dp = " +dp[i][j]);
            }
        }
        
        for(int i = 0 ; i < dp.length; i++) {
            answer = Math.max(dp[dp.length - 1][i] , answer); 
        }
        return answer;
    }
}
