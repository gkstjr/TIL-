package except;

public class Ex4 {
	public static void main(String[] args) {
		try{
			throw new Exception();
		}catch(Exception e) {
			
		}
	
		throw new RuntimeException();
	}
}
