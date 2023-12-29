package ch12;

public class Parent {
	void parentMethod() {}
		
	}
class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {
		
	}
	@FunctionalInterface //함수형 인터페이스는 하나의 추상 메서드만 가능
	interface Testable {
		void test();
//		void check();
	}

	
}
	class Ex10 {
		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();
	}
}


