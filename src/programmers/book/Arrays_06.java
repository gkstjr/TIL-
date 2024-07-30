package programmers.book;
import java.util.*;
public class Arrays_06 {
	public static void main(String[] args) {
		
	}

	  public int[] solution(int N, int[] stages) {
	        
	        HashMap<Integer,Double> fails = new HashMap<Integer,Double>();
	        int[] challenger = new int[N + 2];
	        
	        //도달했으나 클리어하지 못한 플레이어 수 저장
	        for(int i = 0 ; i < stages.length; i++) {
	            challenger[stages[i]] += 1;
	        }
	        
	        double total = stages.length;
	        
	        //1스테이지부터 N 스테이지까지 실패율 계산 (스테이지에 도달한 플레이어 수는 = total - 이전 스테이지들의 도달했으나 클리어하지 못한 수들의 합)
	        
	        for(int i = 1; i <= N; i++) {
	            if(challenger[i] == 0) {
	                fails.put(i, 0.);
	            }else {
	                fails.put(i , challenger[i] / total);
	                total -= challenger[i];
	            }
	        }
	        
	        return fails.entrySet().stream().sorted((o1,o2) -> Double.compare(o2.getValue() , o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
	    }
}
