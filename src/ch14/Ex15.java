package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex15 {
	public static void main(String[] args) {
//		List<Integer>	list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer > intStream = list.stream();  
//		intStream.forEach(System.out::print);
//		
//		//stream은 1회용, stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream();
//		intStream.forEach(System.out::print);
	
		String[] strArr = new String[] {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
		System.out.println("count= " + intStream.count());
		System.out.println("sum = " + intStream.sum());
		System.out.println("average = " + intStream.average());
		
	}
}
