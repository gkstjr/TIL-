package algo;

public class Array {

	public static void main(String[] args) {
		//λ°°μ΄?? ??Ό? ?°?΄?°? λͺ¨μ?΄?€
		//λ°°μ΄?? κ°μ? ???΄κΈ°λ§ ?λ©? ??±?΄ κ°??₯??€
		//ex) λ°°μ΄?? ?°?΄?° κ°μλ₯? μΆλ¦¬?΄? λ¨Όμ? ??±?΄?Ό ??€.
			////= 3λͺμ ???΄ ??΄?Ό ?λ―?λ‘? 3μΉΈμ λ°°μ΄? ??±??€.
			////student -------> [?][?][?]
			int[] student = new int[3];
			  
			student[0] = 60; ///student? +0μ§?? ? 60? ???₯??Ό!
			///student -------->[60][][0]
			student[1] = 75; ///student? +1μ§?? ? 75? ???₯??Ό!
			///student -------->[60][75][0]
			student[2] = 88; ///student? +2μ§?? ? 88? ???₯??Ό!
			///student -------->[60][75][88]
			
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
			
			int total = student[0] + student[1] + student[2];
			System.out.println(total); 
			float average = (float)total / student.length;///student? κΈΈμ΄ = 3
			System.out.println(average);
	
	}

}
