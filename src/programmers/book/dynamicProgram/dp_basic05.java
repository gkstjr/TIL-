package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic05 {
	//복
	 int solution(int[][] land) {
	        int answer = 0;
	        
	        int rowSize = land.length;
	        
	        int[][] dp = new int[rowSize][4];
	        
	        for(int i = 0; i < 4; i++) {
	            dp[0][i] = land[0][i];
	        }
	        
	        for(int i = 1 ; i < rowSize; i++) {
	            for(int j = 0 ; j < 4; j++) {
	                for(int k = 0 ; k < 4; k++) {
	                    if(k == j) continue;
	                    dp[i][j] = Math.max(dp[i - 1][k] + land[i][j], dp[i][j]);
	                }
	                                 //   System.out.println(i + " / " + j + " = " + dp[i][j]);

	            }
	        }
	        for(int i = 0; i < 4;i++) {
	            answer = Math.max(dp[rowSize - 1][i],answer);
	        }
	        
	        return answer;
	    }
}
