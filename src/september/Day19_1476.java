package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Day19_1476 {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int year = 0;
		
		int yearA = 0;
		int yearB = 0;
		int yearC = 0;
				
		while(true) {
			
			yearA++;
			yearB++;
			yearC++;
			
			if(yearA > 15) yearA = 1;
			if(yearB > 28) yearB = 1;
			if(yearC > 19) yearC = 1;
			
			year++;
			
			if(yearA == a && yearB == b && yearC == c) break;
		}
		System.out.println(year);
	}
}