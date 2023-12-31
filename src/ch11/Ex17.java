package ch11;

public class Ex17 {
public static void main(String[] args) {
	Circle c =new Circle();
	c.x =1;
	c.y=2;
	c.r=3;
	System.out.println(c.x);
	System.out.println(c.y);
	System.out.println(c.r);
}
}
class MyPoint2{
	int x;
	int y;
}
class Circle extends MyPoint2{
	int r;
	
}