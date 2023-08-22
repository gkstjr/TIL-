package august1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * */
class Day22_10655 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        String ans = "";
        
        for(int i = 0 ; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	
        	if(ch >= 'A' && ch <='Z' ) { // 대문자
        		if(('Z' - ch) >= 13) {
        			ans += (char)(ch + 13);
        		}else {
        			ans += (char)('A' + 12 - ('Z' - ch)); 
        		}
        	}else if(ch == ' ') {
        		ans += ' ';
        	}
        	else if(ch >= 'a' && ch <= 'z') { // 소문자
        		if(('z' - ch) >= 13) {
        			ans += (char)(ch + 13);
        		}else {
        			ans += (char)('a' + 12 - ('z' - ch));
        		}
        	}else {
        		ans += ch;
        	}
        }

        System.out.println(ans);
    }
       
}
