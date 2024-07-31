package programmers.book;
import java.util.*;

public class Arrays_07 {
	public static void main(String[] args) {
	}

	public int solution(String dirs) {
        int answer = 0;
        int[][] game = new int[11][11];
        int x = 5; int y = 5;
        HashSet<String> visit = new HashSet<String>();
        String[] order = dirs.split("");
    
        for(int i = 0 ; i < order.length; i++) {
            int nx = x;
            int ny = y;
            String nowOrder = order[i];
            if(nowOrder.equals("U")) {
               ny += 1;
            }else if(nowOrder.equals("D")) {
               ny -= 1;
            }else if(nowOrder.equals("R")) {
                nx += 1;
            }else if(nowOrder.equals("L")) {
                nx -= 1;
            }    
            
            if(!isValidMove(nx , ny)) {
                continue;
            }
            
            visit.add(x + " " + nx + " " + y + " " + ny);
            visit.add(nx + " " + x + " " + ny + " " + y);
            
            x = nx;
            y = ny;
        }
        
    
        return visit.size() / 2;
    }
    
    private static boolean isValidMove(int nx , int ny) {
        return nx >= 0 && nx <= 10 && ny >= 0 && ny <= 10;
    }
}
