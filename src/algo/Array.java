package algo;

public class Array {

	public static void main(String[] args) {
		//배열?? ?��?��?�� ?��?��?��?�� 모음?��?��
		//배열?? 같�? ?��?��?��기만 ?���? ?��?��?�� �??��?��?��
		//ex) 배열?? ?��?��?�� 개수�? 추리?��?�� 먼�? ?��?��?��?�� ?��?��.
			////= 3명의 ?��?��?�� ?��?��?�� ?���?�? 3칸의 배열?�� ?��?��?��?��.
			////student -------> [?][?][?]
			int[] student = new int[3];
			  
			student[0] = 60; ///student?�� +0�??��?�� 60?�� ???��?��?��!
			///student -------->[60][][0]
			student[1] = 75; ///student?�� +1�??��?�� 75?�� ???��?��?��!
			///student -------->[60][75][0]
			student[2] = 88; ///student?�� +2�??��?�� 88?�� ???��?��?��!
			///student -------->[60][75][88]
			
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
			
			int total = student[0] + student[1] + student[2];
			System.out.println(total); 
			float average = (float)total / student.length;///student?�� 길이 = 3
			System.out.println(average);
	
	}

}
