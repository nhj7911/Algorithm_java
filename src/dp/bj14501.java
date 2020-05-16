package dp;

import java.util.Scanner;

/*
 * bj14501.java
 * ���� 14501�� : ���
 * version 1.0
 * data 2020.05.15
 */

public class bj14501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // ���� �ϱⰣ
		
		int t[] = new int[n+10]; // ����� �Ϸ��ϴµ� �ɸ��� �ð�
		int p[] = new int[n+10]; // ����� �������� �޴� �ݾ�
		for(int i=1;i<=n;i++) {
			t[i] = s.nextInt();
			p[i] = s.nextInt();
		}

		int dp[] = new int[n+10]; // ���� �� �ִ� �ִ�����
		int max=0;
		
		for(int i=1;i<=n+1;i++) { // n+1�ϱ��� ���ϴ� ������ ��������+1���ϰ����� ���ؾ��ؼ�
			dp[i] = Math.max(dp[i], max); // i�ϱ��� ������ �ִ����Ͱ����� dp[i]�� ���� ��������
			dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]);
			max = Math.max(max, dp[i]); // i�ϱ��� ������ �� �ִ�����
		}
		
		System.out.println(max);
		s.close();
	}

}
