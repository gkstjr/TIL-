package programmers.book.simulation;
import java.util.*;

public class simul_5 {
	public static void main(String[] args) {
	}

	  public int[] solution(String[] keyinput, int[] board) {
	        int[] answer = {};
	        
	        int vertical = board[1]; //세로(2차원배열에선 행)
	        int horizontal = board[0]; //가로(2차원배열에선 열)
	        
	        //중앙(행 , 열)
	        int[] center = new int[]{vertical / 2 , horizontal / 2};
	                
	        int[][] map = new int[vertical][horizontal]; 
	        int moveX = center[0];
	        int moveY = center[1];
	        for(String str : keyinput) {
	            int x = 0, y = 0;
	            switch(str) {
	                case "up": 
	                    x = x + 1;
	                    break;
	                case "down" : 
	                    x = x - 1;
	                    break;
	                case "left" : 
	                    y = y - 1;
	                    break;
	                case "right" : 
	                    y = y + 1;
	                    break;
	            }
	            
	            if(moveX + x < 0 || moveY + y < 0 || moveX + x >= vertical || moveY + y >= horizontal) continue;
	         //   System.out.print(moveX + " " + moveY + " -> ");
	        //    System.out.print(x + " " + y + " = ");
	            moveX += x;
	            moveY += y;
	                  //      System.out.println(moveX + " " + moveY);

	        }
	        return new int[]{moveY - center[1] , moveX - center[0]};
	    }
}
