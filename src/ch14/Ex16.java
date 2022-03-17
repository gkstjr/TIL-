package ch14;

import java.util.Optional;

public class Ex16 {
public static void main(String[] args) {
//	int[] arr = null;
	int[] arr = new int[0];  
	System.out.println("arr.length = "+arr.length);
	
//	Optional<String> opt = null; 바람직하지 않음
	Optional<String> opt = Optional.empty();
	System.out.println("opt = " + opt);
//	System.out.println("opt = " + opt.get());
	String str = "";
	
	str = opt.orElse("EMPTY");
	System.out.println("str="+str);
	
	
}
}
