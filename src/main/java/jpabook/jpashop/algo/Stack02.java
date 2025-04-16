package main.java.jpabook.jpashop.algo;

import java.util.*;

public class Stack02 {
    public static void main(String[] args) {
    	int str1 = 12345;
    	
    	System.out.println(solution(str1));
    }

    public static String solution(int decimal) {
    	
    	Stack<Integer> stk = new Stack<Integer>();
    	
    	while(decimal > 0) {
    		stk.push(decimal % 2);
    		decimal /= 2;
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(!stk.isEmpty()) {
    		sb.append(stk.pop());
    	}
    	
    	return sb.toString();
    }
}
