import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
 
public class Main61 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean[] answer = new boolean[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answerNum = 0;
		for(int i = 0 ; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			answer[i] = true;
			if(num == 1) answer[i] = false;
			else {
				for(int j = 2; j < num; j++) {
					if(num % j == 0) answer[i] = false;
				}
			}
			if(answer[i] == true) answerNum++;
		}
		System.out.println(answerNum);
	}
}