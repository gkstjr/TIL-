package algo;
import java.lang.*;
public class if01 {

	public static void main(String[] args) {
		//그룹 조건 : ?�� �? ?��?��, ?�� �? ?��?��, ?�� �? ?��?��, ...
		//?�� �? ?��?��(ex : ???�� / 짝수)
		
		//�?�?  
		int number =  7;
	
		//계산
		boolean isEven = number % 2 == 0;
		
		//출력
		if(isEven) {
			System.out.println("짝수?��?��?��");
		} 
		else {
			System.out.println("???��?��?��?��");
		}
	}

}
