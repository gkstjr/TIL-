package programmers.book.greedy;
import java.util.*;

public class Greedy_basic02 {
	public static void main(String[] args) {
		int[][] items = {{10,19}, {7,10},{6,10}};
		int[][] items2 = {{10,60}, {20,100},{30,120}};

		int weight_limit = 15;
		double answer = 0;
		
		
		Arrays.sort(items , (a1 , a2) -> {
			double a1PerWeight = Double.valueOf(a1[1]) / a1[0];
			double a2PerWeight = Double.valueOf(a2[1]) / a2[0];
			
			return Double.compare(a2PerWeight , a1PerWeight);
		});
		
		for(int[] x : items) {
			System.out.println(x[0] + " / " + x[1]);
		}
		for(int[] item : items) {
			if(weight_limit <= 0) break;
			double weight = item[0];
			double value = item[1];
			
			System.out.println(weight +" / " + value);
			if(weight <= weight_limit) {
				weight_limit -= weight;
				answer += value;
			}else {
				double percent = weight_limit / weight;
				System.out.println("percent = " + percent + " / " + weight_limit + " / " + weight);
				answer += value * percent;
				weight_limit -= value * percent;
			}
		}
		
		System.out.println(answer);
	
	}

	public static int[] solution(int[] arr) {
		
		
		return arr;
	}
}
