package com.shijiacheng;

import java.util.Scanner;

/*
 * �ж�һ�����Ƿ��ܱ���һ������������һ��ͦ�򵥵����⣬һ��һ��ģ����Ϳ��Ը㶨�ˣ���������Ȼ��ǲ����Լ����������ҵ������д���룬��Ͱ�����ɡ�
 ������������ɿո�ֿ�������M��N��1��M,N��500����
 �������һ�У����M���Ա�N���������YES���������NO�������Сд���У���

 ����1
 ���룺
 21 7
 �����
 YES
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if (m >= 1 && m <= 500 && n >= 1 && n <= 500) {
			if (m % n == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("������������˷�Χ");
		}

	}
}
