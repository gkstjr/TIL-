# TIL

- 학습 후 키워드 위주로 정리해보자  

- 기록을 습관화하자  

# Java
  - [ 원시형vs참조형](https://github.com/gkstjr/TIL-/blob/bcd1b5da4e8d7d8eba845be45bec2ae9e2228957/src/javaStudy/%EC%9B%90%EC%8B%9C%ED%98%95vs%EC%B0%B8%EC%A1%B0%ED%98%95.md)
  - [이스케이프 문자](https://github.com/gkstjr/TIL-/blob/4bbd08cd947dec2ef549f5405929e4f1e2b445bb/src/%EC%9D%B4%EC%8A%A4%EC%BC%80%EC%9D%B4%ED%94%84%EB%AC%B8%EC%9E%90.md)
  - [표준 입력](#표준-입력)
  - [표준 출력](#표준-출력)
  - [If문](#if문)
  - [for문](#for문)
  - [배열](https://github.com/gkstjr/TIL-/blob/2d080254dca8e244304dafde5e303810cdf9c562/src/javaStudy/array.md)
  - [객체 지향 프로그래밍](https://github.com/gkstjr/TIL-/blob/7c66505543a3f80cb98988080f527d9a00b53139/src/javaStudy/object.md)
-------------------------





# 표준 입력

    - 표준 입력 스트림(System.in)을 이용하여 사용자가 입력한 글자를 불러오는 명령이다 
	
    - 출력과 다르게 입력은 신경써야 하는 부분이 많다(그래서 자주사용하지 않음)
	
    - 몇글자를 언제 어떻게 입력할 지 알 수가 없다.
   
    - 입력 보조 도구를 활용한 입력(Scanner)
		    1) 도구는 늘 존재하는 것이 아니다
		    2) 필요할 때 만들어서 써야한다
  
예시코드)
```js
                ////1. 도구를 생성한다
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

}
```


# 표준 출력

표준 출력 스트림(통로)을 이용하여 글자를 내보내는 것이며 System.out 라는 이름을 가지고 있다.

```js
System.out.printl(); //() 안의 내용을 계산하여 출력하고 한 줄 개행
```

# If문

**if문**이란 조건식이 참이면 실행하기 위한 조건문이며 **if else문**은 조건식이 참,거짓에 따라 다르게 동작한다
	true일 때는 if {}안의 코드가 실행되고 false인 경우에는 else {} 의 코드가 실행된다. **if - else if문**은 여러개의 조건을 순차적으로 판단하여 동작한다. if - else문은 두가지 경우 중 하나가 수행되는 구조이며 처리해야 할 조건식이 3개 이상인 경우에는 if-else if 문을 사용한다.

예시코드)
```js
public class if01 {

	public static void main(String[] args) {
		//그룹 조건 : 둘 중 하나, 셋 중 하나, 넷 중 하나, ...
		//둘 중 하나(ex : 홀수 / 짝수)
		
		//준비
		int number =  7;
	
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
```

# for문

- 반복 : 동일하거나 유사한 작업을 지속적으로 수행하는 것
- 코드형식 :  for (1부터 시작(선언부) ; 10이하면 실행(조건부) ; 1씩증가(증감부))
- while 반복문 : 특정 시점까지 반복할 때 유리할 수 있음(for처럼 사용도 가능)

(for문 예시코드)
```js
//for(10번){
		//for( 1 ; 2 ; 3 ) {
		//for( 0부터시작 ; 10 미만이면 실행 ; 1씩증가 ) {
		for(int i = 0 ; i < 10 ; n = i + 1) {
			//System.out.println("hello");
			System.out.println(i);
 		}
```
