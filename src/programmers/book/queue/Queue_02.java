package programmers.book.queue;
import java.util.*;

public class Queue_02 {
	public static void main(String[] args) {
		
		
	}

	 public int[] solution(int[] progresses, int[] speeds) {
	        ArrayList<Integer> answer = new ArrayList<>();
	        
	        int n = progresses.length;
	        int[] dayLeft = new int[n];
	        
	        for(int i = 0; i < n; i++) {
	            dayLeft[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
	        }
	        
	        //각 배포일을 돌면서 먼저 배포해야할 수의 값보다 작으면 count++ 크면 count = 1로 초기화 및         answer에 count 넣어주고 먼저 배포해야할 수의 값 변경
	        int maxDay = dayLeft[0];
	        int count = 0;
	        for(int i = 0 ; i < n; i++) {
	            if(dayLeft[i] <= maxDay) {
	                count++;
	            }else {
	                answer.add(count);
	                count = 1;
	                maxDay = dayLeft[i];
	            }
	        }
	        
	        answer.add(count);
	        
	        
	        return answer.stream().mapToInt(Integer::intValue).toArray();
	    }
}
