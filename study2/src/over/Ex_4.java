package over;

public class Ex_4 {
	public static  boolean contains(String src, String target) {
		boolean con = src.indexOf(target)>=0;
		if(con) return true;
		else return false;
		
	}

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345","67"));
	}
	
}
