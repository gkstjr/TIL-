package java;
import java.lang.*;
public class if01 {

	public static void main(String[] args) {
		//그룹 조건 : 둘 중 하나, 셋 중 하나, 넷 중 하나, ...
		//둘 중 하나(ex : 홀수 / 짝수)
		
		//준비
		int number = 7;
	
		//계산
		boolean isEven = number % 2 == 0;
		
		//출력
		if(isEven) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
	}

}
