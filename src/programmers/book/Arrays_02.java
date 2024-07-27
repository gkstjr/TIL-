package programmers.book;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_02 {
	public static void main(String[] args) {
		int[] arr = {1,3,3,5,6,6,2,2};
		
		int[] answer = Arrays_02.solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(int[] arr) {
		int[] clone = arr.clone();
		
		int[] answer2 = Arrays.stream(clone).distinct().toArray();
		// 왜 굳이 Integer로 변경해야 할까? IntStream인 기본타입에도 sort랑 distinct가 다 있는데?
		// -> 아하 밑의 sort의 Collections 인자랑 같이 넣을 때 기본타입은 안되는구나
		Integer[] answer = Arrays.stream(clone).boxed().distinct().toArray(Integer[] :: new); 
		
		Arrays.sort(answer,Collections.reverseOrder()); //내림차순 정렬
 		
		//int형 배열로 변경 후 반환
		return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
				
	}
}
