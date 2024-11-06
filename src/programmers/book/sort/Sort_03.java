package programmers.book.sort;
import java.util.*;

public class Sort_03 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		solution(array , commands);
	}

    public static int[] solution(int[] array, int[][] commands) {
        int N = commands.length;
        int[] answer = new int[N];
        
        for(int i = 0 ; i < N; i++) {
        	System.out.println(i);
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int j = commands[i][0]; j <= commands[i][1]; j++) {

                list.add(array[j - 1]);
            }
            
            for(int x : list) {
            	System.out.println("list = " + x);
            }
            answer[i] = list.get(commands[i][2] - 1);
        }
        
        return answer;
    }
}
