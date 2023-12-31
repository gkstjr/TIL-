package ch12;

public class Ex14_1 {
	public static void main(String[] args) {
//		object obj = (a, b) -> a > b ? a : b; //람다식 ,익명객체
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a , int b) {
//				return a>b ? a:b;
//			}
//		};
		//람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f = (a, b) -> a > b ? a : b; //람다식 ,익명객체
		int value = f.max(3,5);
		System.out.println(value);
	}
}
@FunctionalInterface
interface MyFunction2 {
	int max(int a , int b);
}
