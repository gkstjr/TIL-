package colombus.week2_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 :
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 ->
//처음에는 dfs로 모든 정점을 탐색하는 방법으로 했지만 N이 100000개에 dfs 재귀함수까지 도니 시간초과가 나왔다. 접근 방법을 잘못 생각하였다 -> tree의 특징을 알고 있었으면 좀 더 쉽게 풀었을 수 있었다.
/*
이 문제를 푸는데 필요한 트리의 성질은 다음과 같다.

1. 트리는 사이클이 없고, 모든 정점이 연결되어 있다. (문제에 나와있다.)
2. N개의 정점이 있을때 N-1개의 간선을 가진다. 

우선, t에 2가 입력되었을 때를 먼저 살펴보쟈. t가 2라는건 간선을 하나 지운다는 의미이다. 

현재 트리인 상태에서 어떠한 간선을 하나 지우면 항상 두개의 트리로 나눠질 수 밖에 없다. 

그러므로 항상 yes를 출력한다.

t에 1이 입력된 경우를 생각해보자. 1이라는건 정점을 하나 지운다는 의미이다. 

이때는 두 가지 경우가 발생할 수 있다.

1. 리프 정점을 삭제한 경우
2. 리프 정점이 아닌 정점을 삭제한 경우
1번이라면 삭제 후에 두개의 트리로 나눠질 수 없고, 2번이라면 삭제 후 두개의 트리로 나눠질 수 있다.
리프는 연결 간선이 하나밖에 존재하지 않는다. 그러므로 이러한 속성을 사용하여 문제를 풀어주면 된다.
*/
 
public class graph_14675_정답 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		List<Integer>[] list = new ArrayList[n+1];
		for(int i=1; i<n+1; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		StringBuilder sb = new StringBuilder();
		int q = Integer.parseInt(br.readLine());
		for(int i=0; i<q; i++) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			if(op==2) {
				sb.append("yes\n");
			}else {
				int idx = Integer.parseInt(st.nextToken());
				if(list[idx].size() >=2) sb.append("yes\n");
				else sb.append("no\n");
			}
		}
		System.out.println(sb.toString());
	}
}
	