package programmers.book;
import java.util.*;
public class Arrays_03 {
	public static void main(String[] args) {
		
	
	}

	    public int[] solution(int[] numbers) {
	        
	        TreeSet<Integer> set = new TreeSet<Integer>();
	        
	        for(int i = 0 ; i < numbers.length; i++) {
	            for(int j = i + 1 ; j < numbers.length; j++) {
	                set.add(numbers[i] + numbers[j]);
	            }
	        }
	        
	        return set.stream().mapToInt(Integer::intValue).toArray();
	    }
	
}
