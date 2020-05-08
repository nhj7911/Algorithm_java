package dp;

import java.util.Scanner;

/*
 * bj2293.java
 * ���� 2293�� : ���� 1
 * version 1.0
 * data 2020.05.08
 */
public class bj2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // n �Է¹��� , ������ ������
		int k = s.nextInt(); // k �Է¹���, 
		
		int coin[] = new int[101]; // ������ ��ġ
		int dp[] = new int[10001]; // n���� ������ ������ ����� k���� �ǰ��ϴ� ����� ��
		
		for(int i=1;i<=n;i++) {
			coin[i]=s.nextInt();
		}
		
		dp[0] = 1;
		for(int i=1;i<=n;i++) { 
			for(int j=coin[i];j<=k;j++){	
				dp[j] += dp[j-coin[i]];
			}
		}
		
		System.out.println(dp[k]);
		s.close();
		
	}

}
