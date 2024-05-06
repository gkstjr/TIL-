package colombus.week3_dfs_bfs_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//문제 설명 : 
//핵심 개념 : dfs / bfs 알고리즘
//예상 시간복잡도 : 
//오답노트 -> 
public class 중간고사_14620 {
	static int n;					
	static int[][] map;
	static long minCost = Integer.MAX_VALUE;	// 출력, 최소 비용
	static boolean[][] blossoms;				// 씨앗 심은 위치 표시
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		blossoms = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		solution(0);
		System.out.println(minCost);
	}
	
	static void solution(int selectedCount) {
		// 씨앗을 심을 수 있는 3개 지점 선택 완료
		if (selectedCount == 3) {
			minCost = Math.min(minCost, calcCost());
			return;
		}

		// 행렬의 가장 바깥 칸에는 씨앗을 심을 수 없음 (꽃잎이 행렬 범위를 벗어남)
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (canPlant(i, j)) {			// 현재 지점에 심을 수 있는지 확인
					// 1) 현재 지점에 씨앗을 심는 경우
					plant(i, j);
					solution(selectedCount + 1);

					// 2) 현재 지점에 씨앗을 심지 않는 경우 - 씨앗 심기 취소 (백트래킹)
					cancelPlant(i, j);
				}
			}
		}
	}

	/* [y][x] 지점에 씨앗을 심을 수 있는지 확인 - 다른 꽃잎과 겹치는지 확인 */
	static boolean canPlant(int y, int x) {
		if (blossoms[y][x])
			return false;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if (blossoms[ny][nx])
				return false;
		}

		return true;
	}

	/* [y][x] 지점에 씨앗을 심음 - 5개 지점에 꽃잎 표시 */
	static void plant(int y, int x) {
		blossoms[y][x] = true;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			blossoms[ny][nx] = true;
		}
	}

	/* [y][x] 지점에 심은 씨앗을 취소 (되돌림) - 5개 지점에 꽃잎 표시 취소 */
	static void cancelPlant(int y, int x) {
		blossoms[y][x] = false;

		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			blossoms[ny][nx] = false;
		}
	}

	/* 씨앗 3개를 심는 비용 계산 */
	static long calcCost() {
		long cost = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (blossoms[i][j])
					cost += map[i][j];
			}
		}

		return cost;
	}
}
	