package programmers.book.tree;
import java.util.*;

public class Tree_04 {
	public static void main(String[] args) {
	}

	   public int[][] solution(int[][] nodeinfo) {
	        
	        Node[] nodes = new Node[nodeinfo.length];
	        int[][] answer = new int[2][nodeinfo.length];
	        
	        for(int i = 0 ; i < nodeinfo.length; i++) {
	            nodes[i] = new Node(nodeinfo[i][0] , nodeinfo[i][1] , i + 1);
	        }
	        
	        Arrays.sort(nodes , (o1 , o2) -> {
	           if(o1.y == o2.y) return Integer.compare(o1.x , o2.x);
	            return Integer.compare(o2.y , o1.y);
	        });
	        
	        Node root = nodes[0];
	        
	        for(int i = 1; i < nodes.length; i++) {
	            Node parent = root;
	        
	            while(true) {
	                if(nodes[i].x < parent.x) {
	                    if(parent.left == null) {
	                        parent.left = nodes[i];
	                        break;
	                    }else {
	                        parent = parent.left;
	                    }
	                }else {
	                    if(parent.right == null) {
	                        parent.right = nodes[i];
	                        break;
	                    }else {
	                        parent = parent.right;
	                    }
	                }
	            }
	        }
	        
	        ArrayList<Integer> preAnswer = new ArrayList<>();
	        preOrder(nodes[0] , preAnswer);
	        
	        ArrayList<Integer> postAnswer = new ArrayList<>();
	        postOrder(nodes[0] , postAnswer);
	        
	        answer[0] = preAnswer.stream().mapToInt(Integer::intValue).toArray();
	        answer[1] = postAnswer.stream().mapToInt(Integer::intValue).toArray();
	        
	        return answer;
	    
	    }
	    
	    public static void preOrder(Node node , ArrayList<Integer> answer) {
	        if(node == null) return;
	        answer.add(node.num);
	        
	        preOrder(node.left , answer);
	        preOrder(node.right , answer);
	    }
	    public static void postOrder(Node node ,  ArrayList<Integer> answer) {
	         if(node == null) return;
	        
	        postOrder(node.left , answer);
	        postOrder(node.right , answer);
	        
	        answer.add(node.num);
	    }
	    private static class Node {
	        int x , y , num;
	        Node left , right;
	        
	        public Node(int x , int y , int num) {
	            this.x = x;
	            this.y = y;
	            this.num = num;
	        }
	    }
}
