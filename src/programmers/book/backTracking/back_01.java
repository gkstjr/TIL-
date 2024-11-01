package programmers.book.backTracking;
import java.util.*;

public class back_01 {
	   static int answer = Integer.MIN_VALUE;
	    static int N;
	    static boolean[] visited2;
	    public int solution(int k, int[][] dungeons) {
	       N = dungeons.length;
	        visited2 = new boolean[N];
	        clear(new boolean[N] , k , 0 , dungeons);
	        return answer;
	    }
	    
	    public static void clear(boolean[] visited , int myFatigue , int clearCnt , int[][] dungeons) {
	        answer = Math.max(clearCnt, answer);
	        
	        
	        if(clearCnt == N) {
	            answer = N;
	        }
	        boolean[] nowVisited = Arrays.copyOf(visited, visited.length);
	        
	        for(int i = 0; i < visited2.length; i++) {
	            if(!visited2[i] && dungeons[i][0] <= myFatigue) {
	                visited2[i] = true;
	                clear(nowVisited , myFatigue - dungeons[i][1] , clearCnt + 1,dungeons);
	                visited2[i] = false;
	            }
	        }
	    }
}
