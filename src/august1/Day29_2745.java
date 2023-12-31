package august1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.prefs.BackingStoreException;
/*

 *  'A' = 65
 * */
class Day29_2745 {
    public static void main(String args[]) throws Exception {
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	long answer = 0;
    	
    	String str = st.nextToken();
    	long B = Long.parseLong(st.nextToken());
    	char ch;
    	int remain = 0;
    	long ze = 1;
    	for(int i = 0 ; i < str.length(); i++) {
    		 ch = str.charAt(str.length() - i - 1);
    		 
    		 if(ch >= 'A' && ch <= 'Z') {
    			 remain = ch - 55;
    		 }else {
    			 remain = Integer.parseInt(String.valueOf(ch));
    		 }
    		 
    		 ze = 1;
    		 for(int j = 0; j < i; j++) {
    			 ze *= B;
    		 }
    		 
    		 answer += ze * remain;
     	}
    	
    	System.out.println(answer);
    }
}
