package ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test16 {
	public static void main(String[] args) {


		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		Stream<Integer>	oneStream = Stream.generate(()->1);
		oneStream
		.limit(10)
		.forEach(System.out::println);
		
	}
}
