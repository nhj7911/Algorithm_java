package lcmgcd;

import java.util.Scanner;

/*
 * bj3036.java
 * ���� 3036�� : ��
 * version 1.0
 * data 2020.05.16
 */

public class bj3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); // ���� ���� n��
		
		int r[] = new int[n+1]; // ���� ������
		for(int i=1;i<=n;i++)
			r[i]=s.nextInt();
		
		for(int i=2;i<=n;i++) {
			int gcd = gcd(Math.max(r[1], r[i]),Math.min(r[1], r[i]));
			System.out.print(r[1]/gcd); //����
			System.out.print("/"); // �м� ����
			System.out.println(r[i]/gcd); //�и�
			
		}
	}
	// �ִ� ����� ���ϴ� �Լ�
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}


}
