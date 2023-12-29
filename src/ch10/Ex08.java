package ch10;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		System.out.println(answer);
		Scanner sc = new Scanner(System.in);
	
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
				
			}else if(input< answer) {
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("정답입니다");
				break;
			}
			
			
			
			
		}while(true);
}
}