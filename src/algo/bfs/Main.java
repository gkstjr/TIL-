package algo.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		int nodeCount = Integer.parseInt(st.nextToken());
		int lineCount = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());
		
		Node[] nodes = new Node[nodeCount + 1];
		for(int i = 0 ; i < nodeCount + 1; i++) {
			nodes[i] = new Node(i);			
		}
		
		for(int i = 0 ; i < lineCount; i++) { // ��� ���� �������ֱ�
			int n = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine());
			
			nodes[n].addSide(nodes[m]);
			nodes[m].addSide(nodes[n]);
		}
		
		for(Node nd : nodes) {
			nd.neighbours.sort(new Com());
		}
		
		DFS(nodes[startNode]);
		
	}		
}


//���� ����
class Com implements Comparator<Node> {
	@Override
	public int compare(Node o1, Node o2) {
		return Integer.compare(o1.info, o2.info);
	}
}

// Ŭ���� node ����
class Node {
	int info;
	boolean visited;
	List<Node> neighbours; // ���� ���
	
	Node(int info) { //������
		this.info = info;
		this.visited = false;
		this.neighbours = new ArrayList<>();
	}
	
	public void addSide(Node n) { //���� ��� ä���
		this.neighbours.add(n);
	}
	
	public List<Node> getSide() { //���� ��� ��ȯ
		return neighbours;
	}
	
	public void setSide(List<Node> n) {// ���� ��� ����
		this.neighbours = n;
	}
	
	@Override
	public String toString() { // ��� �������̵�
		return "" + info;
	}
}