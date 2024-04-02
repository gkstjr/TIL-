package got_of_java.d.lang;

public class NumberObjects {
	public static void main(String[] args) {
		NumberObjects ob = new NumberObjects();
		ob.parseLong("ㄱ1");
		ob.printOtherBase(1024);
	}
	public long parseLong(String data) {
		long number = 0;
		
		try {
			number = Long.parseLong(data);
			System.out.println(number);
			return number;
		}catch(NumberFormatException e) {
			e.getMessage();
			System.out.println(data + "is not a number.");
		}
		return -1;
	}
	
	public void printOtherBase(long value) {
		
		String binary = Long.toBinaryString(value);
		String hex = Long.toHexString(value);
		String octal = Long.toOctalString(value);
		
		System.out.println(value);
		System.out.println(binary);
		System.out.println(hex);
		System.out.println(octal);

	}
}
