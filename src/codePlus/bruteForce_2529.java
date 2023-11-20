package codePlus;

import java.util.*;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.StringTokenizer;


// recur(index ,  num(String타입)
public class bruteForce_2529 { 
	static int k;
	static ArrayList<String> ans = new ArrayList<String>();
	static StringTokenizer st;
	static String[] sign;
	static boolean[] check = new boolean[10]; // true 면 이전에 사용한 숫자임
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		k = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		sign = new String[k];
		
		for(int i = 0 ; i < k; i++) {
			sign[i] = st.nextToken();
		}
		
		recur(0 , "");
		
		Collections.sort(ans);
		
		System.out.println(ans.get(ans.size() - 1));
		System.out.println(ans.get(0));
		
	}
	
	static void recur(int index , String num) {
		if(index == k + 1) {
				ans.add(num);
			
			return;
		}
		
		
		for(int i = 0 ; i < 10; i++) {
			if(check[i]) continue;
			check[i] = true;
			if(ok(num +Integer.toString(i))) {
				recur(index + 1 , num + Integer.toString(i));				
				check[i] = false;
			}
		}
		
		return;
	}

	private static boolean ok(String num) {
		for(int i = 0 ; i < num.length() - 1; i++) {
			if(sign[i].equals("<")) {
				if(num.charAt(i) > num.charAt(i + 1)) return false;
			}else if(sign[i].equals(">")) {
				if(num.charAt(i) < num.charAt(i + 1)) return false;
			}
		}
		
		return true;
	}
}
