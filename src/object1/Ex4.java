package object1;
class Outer3{
	static class Inner {
		int iv = 200;
	}
}



public class Ex4 {
	public static void main(String[] args) {
		Outer3.Inner in = new Outer3.Inner();
		System.out.println(in.iv);
	}
}
