package over;

public class Ex_5 {
	public static String delChar(String src,String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i =0 ; i<src.length();i++) {
			char ch = src.charAt(i);
			if(delCh.indexOf(ch)==-1) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	
	}
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
	}

}
