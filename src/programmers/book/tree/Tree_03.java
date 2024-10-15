package programmers.book.tree;
import java.util.*;

public class Tree_03 {
	    static ArrayList<Integer>[] nei;   
	    static int answer = 0;
	    public int solution(int[] info, int[][] edges) {
	   
	        nei = new ArrayList[info.length];
	        
	        for(int i = 0 ; i < info.length; i++) {
	            nei[i] = new ArrayList<>();
	        }
	        
	        for(int i = 0 ; i < edges.length; i++) {
	            nei[edges[i][0]].add(edges[i][1]);
	        }
	        
	        ArrayList<Integer> res = new ArrayList<>(); // 방문해야할 노드
	        res.add(0);
	            
	        dfs(0 , 0 , 0 , info , res);
	        return answer;
	    }
	    
	    void dfs(int node , int sheepCnt , int wolfCnt , int[] info , ArrayList<Integer> nextVisited) {
	        if(info[node] == 0) { //양
	            sheepCnt++;
	        }else { //늑대
	            wolfCnt++;            
	        }
	        
	        if(wolfCnt >= sheepCnt) return;
	        
	        ArrayList<Integer> temp = new ArrayList<>();
	        
	        temp.addAll(nei[node]);
	        temp.remove(node);
	        
	        answer = Math.max(answer , sheepCnt);
	        
	        if(nei[node].size() != 0) {
	            for(int a : nei[node]) {
	                temp.add(a);
	            }
	        }
	        
	        for(int next : temp) {
	            dfs(next , sheepCnt , wolfCnt , info , temp);
	        }
	    }
}
