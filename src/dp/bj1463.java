package dp;

import java.util.Scanner;

/*
 * bj1463.java
 * ���� 1463�� : 1�� �����
 * version 1.0
 * data 2020.04.25
 */

public class bj1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); // �����Է¹���
		int count = 0;
		while(x != 1) {
			count++;
			if(x % 3 == 0) {
				x=x/3;
			}else if((x-1) % 3 == 0) {
				x--;
			}
			else if (x % 2 == 0) {
				x=x/2;
			}else {
				x--;
			}
		}
		System.out.println(count);
		
	}

}
