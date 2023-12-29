package august1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day24_1406 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Character> mainStk = new Stack<Character>();
        Stack<Character> subStk = new Stack<Character>();
        StringTokenizer st;
        
        for(int i = 0 ; i < str.length(); i++) {
        	mainStk.push(str.charAt(i));
        }
        for(int i = 0 ; i < n; i ++) {
        	st = new StringTokenizer(br.readLine());
        	
        	char order = st.nextToken().charAt(0); 
        	
        	if(order == 'P') {
        		char ch = st.nextToken().charAt(0);
        		mainStk.push(ch);
        	}else if(order == 'L' && !mainStk.isEmpty()) {
        		subStk.push(mainStk.pop());
        	}else if(order == 'D' && !subStk.isEmpty()) {
        		mainStk.push(subStk.pop());
        	}else if(order == 'B' && !mainStk.isEmpty()) {
        		mainStk.pop();
        	}
         }
        
        while(!subStk.isEmpty()) {
        	mainStk.push(subStk.pop());
        }
        
        for(int i = 0 ; i < mainStk.size(); i++) {
        	sb.append(mainStk.get(i));
        }
        System.out.println(sb);
    }

}
