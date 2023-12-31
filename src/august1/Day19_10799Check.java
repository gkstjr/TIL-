package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 	dp[n]은 n개의 카드를 가질 때 가장 큰 최댓
 * */
class Day19_10799Check {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        Stack<Character> stk = new Stack<Character>();
        
        String str = br.readLine();
        char[] ch = str.toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < ch.length; i++) {
        	
        	if(ch[i] == ')') {
        		stk.pop();
        		if(ch[i - 1] == '(') {
        			cnt += stk.size(); 
        		}else {
        			cnt += 1;
        		}
        	}else {
        		stk.push(ch[i]);
        	}
        		
        }
        
        System.out.println(cnt);
       }
}
