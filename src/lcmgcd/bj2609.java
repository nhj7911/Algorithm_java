package lcmgcd;

import java.util.Scanner;

/*
 * bj2609.java
 * ���� 2609�� : �ִ������� �ּҰ����
 * version 1.0
 * data 2020.05.15
 */

public class bj2609 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a= s.nextInt();
		int b= s.nextInt();
	
		System.out.println(gcd(a,b)); // �ִ����� ���
		System.out.println(a*b/gcd(a,b)); // �ּҰ���� ���
		
		s.close();
		
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
