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

//브루트 포스 재귀로 숫자 더하기 문제 풀기
public class bruteForce_1759 { 
	static String[] ans;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static String[] recurAns;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		ans = new String[C];
		recurAns = new String[L];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < C; i++) {
			ans[i] =  st.nextToken();
		}
		
		Arrays.sort(ans);
		recur(0 , 0 , L , C);
		System.out.println(sb);
	}
	static boolean validation(String[] str) {
		int ja = 0;
		int mo = 0;
		for(int i = 0 ; i < str.length; i++) {
			if(str[i].equals("a") || str[i].equals("i") ||str[i].equals("e") || str[i].equals("o") || str[i].equals("u")) {
				mo += 1;
			}else {
				ja += 1;
			}
		}
		return ja >= 2  && mo >= 1;
	}
	static void recur(int index , int start , int L , int C) {
		if(L == index) {
			if(validation(recurAns)) {
				
			for(int i = 0 ; i < L; i++) {
				sb.append(recurAns[i]);				
			}
			sb.append("\n");
			}
			
			return;
		}
		
		for(int i = start; i < C; i++) {
			recurAns[index] = ans[i];
			start = i + 1;
			recur(index + 1 , start,L , C);
		}
	}
}
