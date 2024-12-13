package programmers.book.greedy;
import java.util.*;

public class Greedy_basic01 {
	public static void main(String[] args) {
		int amount = 350;
		int[] money = {100 , 50 , 10 , 1};
		
		int index = 0;
		List<Integer> answer = new ArrayList<>();
		
		while(amount > 0) {
			int useMoney = money[index];
			
			int moneyCnt = amount / useMoney;
			amount = amount % useMoney;
			
			for(int i = 0; i < moneyCnt; i++) {
				answer.add(useMoney);
			}
			
			index++;
		}
		
		System.out.println(answer);
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
