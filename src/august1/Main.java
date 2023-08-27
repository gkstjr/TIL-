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
 * 	'a' - 97
 * 	'z' - 122 
 *  'A' - 65
 *  'Z' - 90
 *  '0' - 48 
 *  '9' - 57
 *  
 * */
class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb;
        
        String str;
        
        while((str = br.readLine()) != null) {
        	int cnt1 = 0; //소문자
        	int cnt2 = 0; //대문자
        	int cnt3 = 0; //숫자
        	int cnt4 = 0; //공백
        	sb = new StringBuilder();
        	
        	for(int i = 0 ; i < str.length(); i++) {
        		
        		char ch = str.charAt(i);
        		if(ch - 0 >= 97 && ch - 0 <= 122) {
        			cnt1++;
        		}else if(ch - 0 >= 65 && ch - 0 <=90) {
        			cnt2++;
        		}else if(ch - 0 >= 48 && ch - 0 <= 57) {
        			cnt3++;
        		}else {
        			cnt4++;
        		}
        	}
        	
        	sb.append(cnt1 + " " + cnt2 + " " + cnt3 + " " + cnt4);
        	System.out.println(sb);
        }
        
     }
}
