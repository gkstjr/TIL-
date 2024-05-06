package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class 중간고사_17478 {
	static String[] str = new String[] {"\"재귀함수가 뭔가요?\"" , "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." , "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
			,"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
	static String start = "____";
	static String strEnd = "라고 답변하였지.";
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		recur(0);
		System.out.println(sb);
	}
	
	static void recur(int depth) {
		String s = "";
		for(int i = 0 ; i < depth; i++) {
			s += start;
		}
		if(depth == N) {	
			sb.append(s).append(str[0]).append("\n");
			sb.append(s).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
			sb.append(s).append(strEnd).append("\n");
			return;
		}
		
		sb.append(s).append(str[0]).append("\n");
		sb.append(s).append(str[1]).append("\n");
		sb.append(s).append(str[2]).append("\n");
		sb.append(s).append(str[3]).append("\n");
		
		recur(depth + 1);
		sb.append(s).append(strEnd).append("\n");
	}
}
	