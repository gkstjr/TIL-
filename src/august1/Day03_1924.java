package august1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day03_1924 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int d = sc.nextInt();
		
		int[] month = {0, 31, 28, 31, 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
		String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		int sum = 0;
		
		for(int i = 0 ; i < y; i++) {
			sum += month[i];
		}
		
		sum += d - 1;
		
		System.out.println(week[sum % 7]);
	}
}
