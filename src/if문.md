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