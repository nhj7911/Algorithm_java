package dp;

import java.util.Scanner;

/*
 * bj2225.java
 * ���� 2225�� : �պ���
 * version 1.0
 * data 2020.05.08
 */

public class bj2225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // n �Է¹���
		int k = s.nextInt(); // k �Է¹���
		
		int[][] dp = new int[201][201]; // k�� ���ؼ� n�� �Ǵ� ����� ��
		
		for(int i=1;i<=k;i++) {
			dp[i][0]=1;
		}
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000000; // 1000000000���� ������ �� ����� �� �ָ� Ʋ�ȴٰ� ��.
			}
		}
		System.out.println(dp[k][n]);
	}

}
