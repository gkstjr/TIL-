package pkg2;
class AAA {
	int i = 100;
	BBB b = new BBB();
	
	class BBB {
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);
		}
	}
}
//class CCC{
//	BBB b = new BBB();
//}

public class InnerTest {

	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		
	
	}

}
