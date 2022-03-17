package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14 {
	public static void main(String[] args) {
		Function<Integer,MyClass> f = MyClass::new;
			
			
		MyClass mc = f.apply(100);
		System.out.println(mc.iv);
		
		System.out.println(f.apply(200).iv);
	
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer,int[]> f2 = int[]::new;
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length = " + arr.length);
	}
}
class MyClass {
	int iv;

	MyClass(int iv){
		this.iv= iv;
	}
}