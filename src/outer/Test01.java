package outer;
 class Outer {
 		class Inner{
 			int iv = 100;
 		}
 	}



 class Test01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner ii = o.new Inner();
		System.out.println(ii.iv);
		
	}	
 }
		
