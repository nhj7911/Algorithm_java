package dp;

import java.util.Scanner;

/*
 * bj2293.java
 * ���� 1932�� : �����ﰢ��
 * version 1.0
 * data 2020.05.15
 */

public class bj1932 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // �ﰢ���� ũ�� n �Է¹���
		
		// �����ﰢ�� �Է¹���
		int list[][] = new int[501][501];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				list[i][j]=s.nextInt();
			}	
		}
		
		// ����� �հ� �ִ밪 ����
		int [][] dp = new int[501][501];
		int max=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) dp[i][1]=dp[i-1][1]+list[i][1]; // �� ���� ��
				dp[i][j]=Math.max(dp[i-1][j-1],	dp[i-1][j])+list[i][j];
				if(j==i)dp[i][i]=dp[i-1][i-1]+list[i][i]; // �� ������ ��
				max = Math.max(max, dp[i][j]);
			}			
		}
		
		System.out.println(max);
		s.close();
	}
}
