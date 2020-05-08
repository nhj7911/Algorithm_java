package dp;

import java.util.Scanner;

/*
 * bj11726.java
 * ���� 11726�� : 2xn Ÿ�ϸ�
 * version 1.0
 * data 2020.05.08
 */
public class bj11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // n �Է¹���
	
		int dp[] = new int[1001];
		
		dp[0] = 0; // �ʱ�ȭ �����ָ� ��Ÿ�� ����
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<=n;i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10007;
		}
		
		System.out.println(dp[n]);
		
	}

}
