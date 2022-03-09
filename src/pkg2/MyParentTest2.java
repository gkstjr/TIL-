package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); // 에러
//		System.out.println(dft); // 에러
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}




public class MyParentTest2 {
	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv); private 는 다른 클래스에서 실행불가
//		System.out.println(p.dft);
//		System.out.println(p.prt);
		System.out.println(p.pub);
	
	}
}
