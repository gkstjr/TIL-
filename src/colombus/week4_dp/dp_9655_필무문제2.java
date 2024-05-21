package colombus.week4_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 돌 게임 돌은 1개 또는 3개 가져갈 수 있으면 마지막 돌을 가져가는 사람이 승리
//핵심 개념 : dp 알고리즘 -> 근데 그냥 홀수일 때는 상근 win 짝수일 때는 창영 win으로 해도 되지 않나?
//예상 시간복잡도 : 
//오답노트 -> 
public class dp_9655_필무문제2 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		
		System.out.println((N % 2 == 0? "CY" : "SK"));
		
	}
		
}	