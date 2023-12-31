package ch10;

public class Ex03 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 0;
		for(int i =1;true;i++,s= -s)	{
			num = i*s;
			sum +=i;
		if(sum>=100)break;
		}
	
		
		
		System.out.println(num);
	}

}
