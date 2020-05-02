package dp;
/*
 * bj1463.java
 * ���� 1149�� : RGB�Ÿ� 
 * version 1.0
 * data 2020.04.28
 */

import java.util.Scanner;

public class bj1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // ���� �� �Է� ����
		
		int[][] list = new int[n][3]; // �� ���� ĥ�ϴ� ����� �ִ� �迭
		int[][] dp = new int[n][3]; // ��� ���� ĥ�ϴ� ���
		
		for(int i=0;i<n;i++) {
			for (int j=0;j<3;j++) {
				list[i][j] = s.nextInt();				
			}
		}
		
		// ù��° �� ĥ�ϴ� ��� �־���
		dp[0][0] = list[0][0];
		dp[0][1] = list[0][1];
		dp[0][2] = list[0][2];
		
		// ����� �ּڰ� ���ؼ� ����
		for(int i=1;i<n;i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+list[i][0]; // i��°�� R�� ĥ�� ���
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+list[i][1]; // i��°�� G�� ĥ�� ���
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1])+list[i][2]; // i��°�� B�� ĥ�� ���
		}
		
		System.out.println(Math.min(Math.min(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
		s.close();
	}

}
