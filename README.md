# TIL

- 학습 후 키워드 위주로 정리해보자  

- 기록을 습관화하자  

# Java
  - [ 원시형vs참조형](#원시형vs참조형)
  - [이스케이프 문자](#escape-sequence)
  - [표준 입력](#표준-입력)


# 원시형vs참조형 

 - **원시형은 프로그래밍의 기초를 이루는 근원 데이터들의 형태(byte,short,int,long,boolean......)이다 **
 - **참조형은 복잡한 기능이 담겨 있는 덩어리(객체)와 리모컨(참조변수)이 존재하는 형태다.**

예시코드) 
```js
    String a ="hello"; 
		System.out.println(a);
		System.out.println(a.length());//a라는 리모컨의 length라는 버튼을 눌러라라는 뜻(원시형에서는 절대불가)
		System.out.println(a.charAt(0));//a라는 리모컨의 charAt() 버튼 누르면서 0 전해줘라!
   ```

# Escape sequence

- **이스케이프 문자란 화면에 표시되지 않고 특수한 작업을 수행하는 글자(ex : 엔터,탭)**
    
    1.  \ 뒤에 글자를 하나 추가하여 특정 효과를 발생시킨다
	  
    2.  \t는 tab 효과가 발생한다(tab)
    
    3.  \n은 enter 효과가 발생한다(new line,개행)

# 표준 입력

    - 표준 입력 스트림(System.in)을 이용하여 사용자가 입력한 글자를 불러오는 명령이다 
	
    - 출력과 다르게 입력은 신경써야 하는 부분이 많다(그래서 자주사용하지 않음)
	
    - 몇글자를 언제 어떻게 입력할 지 알 수가 없다.
   
    - 입력 보조 도구를 활용한 입력(Scanner)
		    1) 도구는 늘 존재하는 것이 아니다
		    2) 필요할 때 만들어서 써야한다
  
예시코드)
```////1. 도구를 생성한다
		////= System.in과 연결된 Scanner를 만들어서 sc라는 이름의 리모콘으로 조작할 수 있게 준비해놔라(객체생성)
		//// ex)
		Scanner sc = new Scanner(System.in);
		
		////2.입력 명령을 내린다.
		////(1) 문자열 입력
		String a = sc.next();
		System.out.println("a = " + a);
	
		////(2) 정수 입력
		int b = sc.nextInt();
		System.out.println("b = " + b);
	
		////(3) 실수 입력
		double c = sc.nextDouble();
		System.out.println("c = " + c);
	
		////3. 입력을 마치면 사용한 도구를 정리
		sc.close(); //안쓰면 메모리나 전기가 낭비되서 다운될수 있음
		
		
	}

}```
