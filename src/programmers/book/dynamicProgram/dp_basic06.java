package programmers.book.dynamicProgram;
import java.util.*;

public class dp_basic06 {
	   static int[] mx = {-1 , -1 , 0}; //열
	    static int[] my = {0 , -1 , -1}; //행
	    
	    public int solution(int [][]board)
	    {
	        int answer = Integer.MIN_VALUE;
	        
	        int rowSize = board.length; //행 크기
	        int colSize = board[0].length; //열 크기
	        int[][] dp = new int[rowSize][colSize];
	        
	        for(int i = 0; i < rowSize; i++) {
	            Loop1:
	            for(int j = 0 ; j < colSize; j++) {
	                if(board[i][j] != 1) continue;     
	                int min = Integer.MAX_VALUE;
	                for(int k = 0; k < 3; k++) {
	                  int nextX = j + mx[k];
	                  int nextY = i + my[k];
	                    
	                  if(nextX < 0 || nextY < 0) {
	                      dp[i][j] = 1;
	                      continue Loop1;
	                  }
	                  min = Math.min(min, dp[nextY][nextX]);
	                }
	                dp[i][j] = min + 1;
	            }
	        }
	        
	        for(int i = 0; i < rowSize; i++) {
	            for(int j = 0 ; j < colSize; j++) {
	                answer = Math.max(answer , dp[i][j]);
	            }
	        }
	        return answer * answer;
	    }
}
