package algo;
import java.lang.*;
public class if01 {

	public static void main(String[] args) {
		//κ·Έλ£Ή μ‘°κ±΄ : ? μ€? ??, ? μ€? ??, ?· μ€? ??, ...
		//? μ€? ??(ex : ??? / μ§μ)
		
		//μ€?λΉ?  
		int number =  7;
	
		//κ³μ°
		boolean isEven = number % 2 == 0;
		
		//μΆλ ₯
		if(isEven) {
			System.out.println("μ§μ???€");
		} 
		else {
			System.out.println("??????€");
		}
	}

}
