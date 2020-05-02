package dp;
/*
 * bj1912.java
 * ���� 1912�� : ������
 * version 1.0
 * data 2020.05.02
 */
import java.util.Scanner;

public class bj1912 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // ���� �Է� ����
		
		int[] p = new int[n]; // ���� �迭
		int[] dp = new int[n]; // ���� ū ��
		
		for (int i=0;i<n;i++) {
			p[i]=s.nextInt();
		}
		
		dp[0] = p[0];
		int max = p[0];
		for(int i=1; i<n; i++) {
			dp[i]=Math.max(dp[i-1] + p[i], p[i]);
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		s.close();
	}
}
