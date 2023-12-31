package codePlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 인프런 rest API 강의 완료 - > 간단하게 머리 식히기용으로 듣기 좋았음 코드플러스 2/2 문제 내일 부터 시작
public class bruteForce_2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			list.add(n);
			sum += n;
		}
		
		int a = 0;
		int b = 0;
		Collections.sort(list);
		Loop1 :
		for(int i = 0 ; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if((sum - list.get(i) - list.get(j)) == 100) {
					a = list.get(i);
					b = list.get(j);
					break Loop1;
				}
			}
		}
		
		for(int i : list) {
			if(i == a || i == b) continue;
			System.out.println(i);
		}
	}
}
