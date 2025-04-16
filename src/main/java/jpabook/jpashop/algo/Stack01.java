package main.java.jpabook.jpashop.algo;

import java.util.*;

public class Stack01 {
    public static void main(String[] args) {
    	String str = "()()";
    	String str1 = "(())()";
    	
    	System.out.println(solution(str1));
    }

    public static boolean solution(String s) {
    	Stack<Character> stk = new Stack<Character>();
    		
    	for(int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		
    		if(ch == '(') stk.push(ch);
    		if(ch == ')') {
    			if(stk.size() == 0) return false;
    			stk.pop();
    		}
    	}
    	if(stk.size() != 0) return false;
    	
        return true;
    }
}
