package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//피연산자는 결과에 넣고 연산자는 스택에 넣기
//연산자를 스택에 넣을 때 스택에 가장 최상단이 넣을 연산자보다 우선순위가 낮을때까지 결과에 pop하기
//"("는 스택에 넣고 ")" 만나면 스택에서 (가 나올기 전에 연산자들을 pop해서 결과에 넣기   
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stk = new Stack<Character>();
		
		String str = br.readLine();
		String ans = "";
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				ans += ch;
			}else {
				if(ch == ')') {
					while(stk.peek() != '(') {
						ans += stk.pop();
					}
					stk.pop();
				}else if(ch == '('){
					stk.push(ch);
				}else {
					while(!stk.isEmpty() && precedence(stk.peek()) >= precedence(ch)) {
						ans += stk.pop();
					}
					stk.push(ch);
				}
			}
		}
	
	while(!stk.isEmpty()) {
		ans += stk.pop();
	}
	
	System.out.println(ans);
	}
	
	static int precedence(char ch) {
		if(ch == '+' || ch == '-') return 1;
		if(ch == '*' || ch == '/') return 2;
		return 0;
	}
}
