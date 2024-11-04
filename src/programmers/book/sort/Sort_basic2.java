package programmers.book.sort;
import java.util.*;

public class Sort_basic2 {
	public static void main(String[] args) {
		
		int[] arr1 = {3,4,5};
		int[] arr2 = {1,2,6,7,10};
		int i = 0;
		int j = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		
		while(i < arr1.length || j < arr2.length) {
			if(i >= arr1.length) {
				answer.add(arr2[j]); j++;
				continue;
			}else if(j >= arr1.length) {
				answer.add(arr1[i]); i++;
				continue;
			}
			
			if(arr1[i] >= arr2[j]) {
				answer.add(arr2[j]); 
				j++;
			}else {
				answer.add(arr1[i]);
				i++;
			}
		}
	
		System.out.println(answer.toString());
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
