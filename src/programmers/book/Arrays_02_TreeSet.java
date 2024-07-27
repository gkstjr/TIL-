package programmers.book;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Arrays_02_TreeSet {
	public static void main(String[] args) {
		int[] arr = {1,3,3,5,6,6,2,2};
		
		int[] answer = Arrays_02_TreeSet.solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(int[] arr) {
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
				
		for(int i : arr) {
			set.add(i);
		}
		
		int[] result = new int[set.size()];
		
		for(int i = 0 ; i < result.length; i++) {
			result[i] = set.pollFirst();
		}
		
		return result;
	}
}
