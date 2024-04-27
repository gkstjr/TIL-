package colombus.week1_bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 //문제 설명 : N장에 숫자(1~99)가 적혀있는 카드에서 k장을 선택하여 가로로 정수를 만들 때 몇 개의 정수를 만들 수 있나? (단 중복되는 정수는 포함 x)
 //핵심 개념 : DFS 알고리즘 , SET 자료구조(중복제거)


public class dfs_브투르토스dfs_5568 {
   static HashSet<String> hash = new HashSet<String>(); //중복되는 정수를 포함시키지 않기 위해 set 자료구조 사용
   static int depth , n , k; //dfs 함수에서 깊이 or 선택 카드 개수
   static String[] arr; // 총 카드의 숫자 정보
   static boolean[] visited; // dfs함수에서 해당 카드를 이미 선택했는지 여부 판단
   public static void main(String[] args) throws Exception{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   n = Integer.valueOf(br.readLine()); //총 카드의 개수 입력
	   k = Integer.valueOf(br.readLine()); //선택할 카드 개수 입력
	   
	   arr = new String[n];
	   visited = new boolean[n];
	   for(int i = 0 ; i < n; i++) {
		   arr[i] = br.readLine();
	   }
	   
	   dfs(0 , "");
	   System.out.println(hash.size());
	   
   }
    
   public static void dfs(int cnt , String tmp) {
	   if(cnt == k) { // 카드 선택개수가 k개가 되면 해당 숫자 문자열을 set에 저장 재귀함수 종료
		  hash.add(tmp);
		  return;
	   }
	   
	   for(int i = 0 ; i < n; i++) {
		   if(!visited[i]) { // 아직 i인덱스의 카드를 방문하지 않았을 때
			   visited[i] = true; //방문 완료
			   dfs(cnt + 1 , tmp + arr[i]); //선택한 카드를 현재 숫자 문자열 뒤에 이어 붙이고 선택카드 개수 추가 후 재귀함수 호출
			   visited[i] = false; // 같은 depth에서 다른 숫자도 방문여부를 구해야 하기 때문에 초기화
		   }
	   }
   }
}