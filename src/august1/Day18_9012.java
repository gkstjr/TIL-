package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day18_9012 {
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	Loop1 :
    	for(int i = 0 ; i < T; i++) {
    		st = new StringTokenizer(br.readLine(),"");
    		Stack<String> stk = new Stack<String>();
    			
    			String order = st.nextToken();
    			char[] ch = order.toCharArray();
    			for(int k = 0 ; k < ch.length; k++) {
	    			switch(ch[k]) {
	    			
	    				case '(' :  stk.push(order);	
	    					   break;
	    			
	    				case ')' : if(stk.isEmpty()) {
	    								sb.append("NO").append("\n");
	    								continue Loop1;
	    							}
	    					   else	stk.pop();
	    					   break;
	    			}   			
    			}
    		if(stk.isEmpty()) sb.append("YES").append("\n");
    		else sb.append("NO").append("\n");
    	}
    	System.out.println(sb);
    }
}
