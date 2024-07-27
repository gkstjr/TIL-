package programmers.book;
import java.util.*;
/* 문제 분석
 *  
 * */
public class Arrays_04 {
	public static void main(String[] args) {
		
	}
	  public int[] solution(int[] answers) {
	        int[] scores = new int[3];
	        
	        //1,2,3 번의 찍는 방식
	        int[][] patterns = {
	            {1,2,3,4,5},
	            {2,1,2,3,2,4,2,5},
	            {3,3,1,1,2,2,4,4,5,5}
	        };
	        
	        for(int i = 0 ; i < answers.length; i++) {
	            for(int j = 0; j < 3; j++) {
	                if(answers[i] == patterns[j][i % patterns[j].length])
	                    scores[j]++; 
	            }
	        }
	        
	        int maxCount = Arrays.stream(scores).max().getAsInt();
	        
	        ArrayList<Integer> answer = new ArrayList<Integer>();
	        
	        for(int i = 0; i < scores.length; i++) {
	            if(scores[i] == maxCount) answer.add(i + 1);
	        }
	        
	        return answer.stream().mapToInt(Integer::intValue).toArray();
	    }
}
