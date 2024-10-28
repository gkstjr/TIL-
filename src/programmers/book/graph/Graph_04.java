package programmers.book.graph;
import java.util.*;

public class Graph_04 {
	public static void main(String[] args) {
		String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
		
		solution(maps);
	}
	  public static int solution(String[] maps) {
	        int answer = 0;
	        int exitFirst = 0;
	        boolean[][] visited = new boolean[maps.length][maps[0].length()];
	        String[][] map = new String[100][100];
	        
	        for(int i = 0 ; i < maps.length; i++) {
	            for(int j = 0 ; j < maps[i].length(); j++) {
	                map[i][j] = String.valueOf(maps[i].charAt(j));
	                System.out.println(map[i][j]);
	            }
	        }
	        
	        boolean reverOn = false;
	        boolean exit = false; // 출구 먼저면 true , 나중 false
	        
	        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
	        return answer;
	    }
}
