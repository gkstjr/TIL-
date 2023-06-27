package algo.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class bfs1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nodeCount = sc.nextInt();
        int lineCount = sc.nextInt();
        int startNode = sc.nextInt();

        Node[] nodes = new Node[nodeCount+1];
        for(int i=0; i<nodeCount+1; i++)
            nodes[i] = new Node(i);

        for(int i=0; i<lineCount; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            nodes[s].addSide(nodes[e]);
            nodes[e].addSide(nodes[s]);
        }

        for(Node n : nodes)
            n.neighbours.sort(new Com());

        DFS(nodes[startNode]);

        System.out.println();
        reset(nodes);

        BFS(nodes[startNode]);
    } // main ³¡

    static void reset(Node[] nodes){
        for(Node v : nodes)
            v.visited=false;
    }

    static void DFS(Node node){

        node.visited=true;
        System.out.printf("%d",node.info);
        List<Node> list = node.getSide();
        for(Node n : list){
            if(!n.visited) {
                System.out.print(" ");
                DFS(n);
            }
        }
    }

    static Queue<Node> queue = new LinkedList<>();
    
    static void BFS(Node node){
        node.visited = true;
        queue.add(node);
        System.out.print(node.info);

        while(!queue.isEmpty()){
            Node v = queue.remove();
            List<Node> neigh = v.neighbours;

            for(Node w : neigh){
                if(!w.visited){
                    System.out.print(" "+w.info);
                    w.visited = true;
                    queue.add(w);
                }
            }
        }
    }
}

class Com2 implements Comparator<Node>{
    @Override
    public int compare(Node o1, Node o2) {
        return Integer.compare(o1.info, o2.info);
    }
}