package ch11;

public class Ex13 {
	public static boolean isNumber(String str) {
		if(str.equals("")||str.equals(null))return false;
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			if(a<'0'||a>'9') {
				
			return false;
				
			}
	}
		return true;
	}


public static void main(String[] args) {
	String str = "123";
	System.out.println(isNumber(str));

	str = "1234o";
	System.out.println(isNumber(str));

}
}	
	
