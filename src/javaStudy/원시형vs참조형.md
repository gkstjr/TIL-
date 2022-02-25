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
   