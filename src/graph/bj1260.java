package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * bj1260.java
 * ���� 1260�� : DFS�� BFS
 * version 1.0
 * data 2020.05.23
 */

public class bj1260 {
	private static int n, m, v; 
	private static int[][] map; 
	private static boolean[] visit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt(); // ������ ����
		m = s.nextInt(); // ������ ����
		v = s.nextInt(); // Ž�� ������ ������ ��ȣ
		
		map = new int[n+1][n+1]; 
		while(m-->0) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			map[x][y]=map[y][x]=1;
		}
		visit = new boolean[n+1];
		dfs(v);
		
		System.out.println("");
		
		visit = new boolean[n+1];
		bfs(v);
		
	}
	static void dfs(int s) {
		if(visit[s]) { // �̹� �湮�� �� ������
			return; // �Ѿ
		}
		
		visit[s] = true; // �湮
		System.out.print(s+" ");

		for(int i=1;i<=n;i++) {
			if(map[s][i] == 1) {
				dfs(i);
			}
		}
		
	}
	static void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s); // ť�� ù���� ������ ����
		visit[s] = true;
		
		while(!q.isEmpty()) { // 2��°���� �湮
			// ť�� ù��° �����͸� �̸� ���ְ� ����
			int temp = q.poll();
			System.out.print(temp+" ");
			
			for(int i=1;i<=n;i++) { // ���ʴ�� ť�� �־���
				if(map[temp][i]==1 && !visit[i]){
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}
	
}
