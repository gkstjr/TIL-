package colombus.week1_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
//문제 설명 : 하루에 한 시간 단위로 일을 하거나 쉬어도 되며 입력받은 피로도 만큼을 사용해서 최대로 처리할 수 있는 일을 출력하는 문제
//핵심 개념 : 재귀함수를 이용하여 일을 할 때와 안할 때의 경우의수를 모두 구하자(브루트포스 알고리즘)
//예상 시간복잡도 : 2의 24승(경우의 수 2개를 24번(24시간))
//오답노트 -> 	종료조건을 24일까지는 측정하고 25되면 종료되는 걸 헷갈림
public class 브루트포스_22864_피로도 {
	static int A , B , C , M; // 입력 받을 변수들
	static int answer = Integer.MIN_VALUE; //최대로 처리할 수 있는 일 처리
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.valueOf(st.nextToken());
		B = Integer.valueOf(st.nextToken());
		C = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		recur(0 , 0 , 0);
		System.out.println(answer);
	}
   
	public static void recur(int fatigue , int cnt , int work) {
		if(fatigue < 0) fatigue = 0; // 피로도가 음수면 0
		if(cnt == 25 || fatigue > M) return; // 24시간이 거나 피로도가 M을 넘으면 재귀 함수 종료
		if(work > answer) answer = work;
	
		recur(fatigue + A , cnt + 1 , work + B); //피로도 쌓이고 일처리 할때
		recur(fatigue - C , cnt + 1 , work); //피로도 줄이고 일처리 안 할 때
		
	}
    
}