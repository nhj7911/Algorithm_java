package dp;
/*
 * bj1463.java
 * ���� 1256�� : ������ �ý�
 * version 1.0
 * data 2020.04.29
 */
import java.util.Scanner;

public class bj2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // ������ �� �Է� ����
		
		int[] p = new int[n]; // �������� ��
		int[] dp = new int[n]; // �ִ�� ���� �� �ִ� �������� ��
		
		for (int i=0;i<n;i++) {
			p[i]=s.nextInt();
		}
		
		if(n>=1) dp[0]=p[0];
		if(n>=2) dp[1]=p[0]+p[1];
		if(n>=3) dp[2]= Math.max(Math.max(dp[1], dp[0]+p[2]),p[1]+p[2]);
		for(int i=3;i<n;i++) {
			dp[i]=Math.max(Math.max(dp[i-1], dp[i-2]+p[i]),dp[i-3]+p[i-1]+p[i]);
		}
		
		System.out.println(dp[n-1]);
		s.close();
	}

}
