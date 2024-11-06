package programmers.book.sort;
import java.util.*;

public class Sort_04 {
	 public String solution(int[] num) {
	        String answer = "";
	        Integer[] numbers = Arrays.stream(num).boxed().toArray(Integer[]::new);
	        
	        Arrays.sort(numbers , (o1, o2) -> {
	          String str1 = String.valueOf(o1) + String.valueOf(o2);
	          String str2 = String.valueOf(o2) + String.valueOf(o1);
	          
	          return str2.compareTo(str1);
	        });
	        
	        for(int s : numbers) {
	            answer += s;
	        }
	        return answer;
	    }

}
