package programmers.book.sort;
import java.util.*;

public class Sort_basic {
	public static void main(String[] args) {
		String s = "algorithm";
		int[] answer = new int[130];
		
		char[] ch = s.toCharArray();
		
		for(char c : ch) {
			answer[c]++; 
		}
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] != 0) {
				for(int j = 0 ; j < answer[i]; j++) {
					str.append((char)i);
				}
			}
		}
		System.out.println(str);
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
