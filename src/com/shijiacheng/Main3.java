package com.shijiacheng;

import java.util.Scanner;

/**
 * �ж����� ���ڴ���1�������������1���������������ٱ����� ����ô����˵����һ���������������ж�һ�����ǲ���������ϣ������д�����򣬰����������жϡ�
 * �������һ�У�Ϊһ������N��1 < N ��1000�����������ȸ����������жϵ����֡�
 * �������һ�У�������ȸ���������NΪ��������ô���YES�����N������������ô���NO��
 * 
 * ����1 ���룺 3 ����� YES
 * 
 * @author lzx-t006
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 1 && n <= 1000) {

			if (n == 2 || n == 3) {
				System.out.println("YES");
			} else {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						System.out.println("NO");
					} else {
						System.out.println("YES");
					}
				}
			}

		} else {
			System.out.println("������������˷�Χ");
		}
	}
}
