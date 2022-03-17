package ch12;

public class Ex14 {
	public static void main(String[] args) {
//		object obj = (a, b) -> a > b ? a : b; //람다식 ,익명객체
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b ;
			}
		};
	
//		int value = obj.max(3,5);
	
	}
}
