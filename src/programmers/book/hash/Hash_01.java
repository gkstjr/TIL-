package programmers.book.hash;
import java.util.*;

public class Hash_01 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,8};
		int target1 = 6;
		
		int[] arr2 = {2,3,5,9};
		int target2 = 10;
		
		System.out.println(solution(arr1 , target1));
		System.out.println(solution(arr2 , target2));

	}

	public static boolean solution(int[] arr , int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
		
		for(int i = 0 ; i < arr.length; i++) {
			map.put(arr[i], arr[i]);
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			int findNum =  target - arr[i];
			
			
			if(map.containsKey(findNum) && findNum != arr[i]) {
				//System.out.println(findNum + " i = " + i);
				return true;
			}
		}
		
		return false;
	}
}
