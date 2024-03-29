package got_of_java.c.exception;

public class Calculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {		
			calc.printDivide(1 , 2);
			calc.printDivide(1 , 0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void printDivide(double a , double b) throws Exception{
		if(b == 0) {
			throw new RuntimeException("Second value can't be Zero");
		}
		double result = a / b;
		
		System.out.println(result);
		
	}
}