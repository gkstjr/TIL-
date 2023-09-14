package september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.xml.soap.Node;


public class Day12_7576 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, M;
	static int[][] box;
	static Queue<toma> q = new LinkedList<toma>();
	static int day =0;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
	    N = Integer.parseInt(st.nextToken());
	
	    box = new int[N][M];
	    
	    for(int i = 0; i < N; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	
	    	for(int j = 0 ; j < M; j++) {
	    		box[i][j] = Integer.parseInt(st.nextToken());
	    		
	    		if(box[i][j] == 1) {
	    			q.offer(new toma(i,j,0));
	    		}
	    	}
	    }
	    
	    bfs();
	    
	    for(int i = 0 ; i < N; i++) {
	    	for(int j = 0 ; j < M; j++) {
	    		if(box[i][j] == 0) 
	    			day = -1;
	    	}
	    }
	    
	    if(day != -1) {
	    	System.out.println(day - 1);
	    }else {
	    	System.out.println(day);
	    }
	}
	
	public static void bfs() {
		int[] dx = {1, -1 , 0, 0};
		int[] dy = {0, 0, 1 , - 1};
		
		while(!q.isEmpty()) {
			toma tomas = q.poll();
			int days = tomas.day + 1;
			
			for(int i = 0 ; i < 4; i++) {
				int nextX = tomas.x + dx[i];
				int nextY = tomas.y + dy[i];
				if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
					day = days;
					if(box[nextX][nextY] == 0) {
						q.offer(new toma(nextX, nextY, days));
						box[nextX][nextY] = 1;	
					}
				}
				
			}
		}
	}
}

class toma{
	int x;
	int y;
	int day;
	
	toma(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}
}
