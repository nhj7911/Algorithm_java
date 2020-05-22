package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * bj11724.java
 * ���� 11724�� : ���� ��ҿ� ����
 * version 1.0
 * data 2020.05.23
 */

public class bj11724 {
	private static int n, m, v; 
	private static int[][] map; 
	private static boolean[] visit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt(); // ������ ����
		m = s.nextInt(); // ������ ����
		
		map = new int[n+1][n+1]; 
		while(m-->0) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			map[x][y]=map[y][x]=1;
		}
	
		int cnt=0; // ���� ����� ����
		visit = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			if(!visit[i]) { // �湮�� �� ������ ��
				dfs(i);
				cnt++;
			}
		}

		System.out.println(cnt);
		
	}
	static void dfs(int s) {
		if(visit[s]) { // �̹� �湮�� �� ������
			return; // �Ѿ
		}
		
		visit[s] = true; // �湮

		for(int i=1;i<=n;i++) {
			if(map[s][i] == 1) {
				dfs(i);
			}
		}
		
	}
	
}
