package javaStudy;

public class Array {

	public static void main(String[] args) {
		//배열은 동일한 데이터의 모음이다
		//배열은 같은 형태이기만 하면 생성이 가능하다
		//ex) 배열은 데이터 개수를 추리해서 먼저 생성해야 한다.
			////= 3명의 학생이 있어야 하므로 3칸의 배열을 생성한다.
			////student -------> [?][?][?]
			int[] student = new int[3];
			
			student[0] = 60; ///student의 +0지점에 60을 저장하라!
			///student -------->[60][][0]
			student[1] = 75; ///student의 +1지점에 75을 저장하라!
			///student -------->[60][75][0]
			student[2] = 88; ///student의 +2지점에 88을 저장하라!
			///student -------->[60][75][88]
			
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
			
			int total = student[0] + student[1] + student[2];
			System.out.println(total); 
			float average = (float)total / student.length;///student의 길이 = 3
			System.out.println(average);
	
	}

}
