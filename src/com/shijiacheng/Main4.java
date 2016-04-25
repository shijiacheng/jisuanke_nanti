package com.shijiacheng;

import java.util.Scanner;

/**
 * 쳲�����������һ�ַǳ�����˼�����У��� 0 �� 1 ��ʼ��֮���쳲�����ϵ������֮ǰ��������ӡ�����ѧ��ʽ����쳲�������������Կ���������ʽ��
 * 
 * F0=0
 * F1=1
 * Fn=Fn-1+Fn-2
 * 
 * ����Լ��Fn��ʾ쳲��������еĵ�n�����֪��쳲����������е��κ�һ����
 * �������һ�У�����һ������N��0��N��50����
 * �������һ�У�����һ�����֣�Ϊ쳲��������еĵ�N���ֵ��
 * ����1
 * ���룺
 * 7 �����
 * 13
 * @author shijiacheng
 *
 */
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=0&&n<=50) {
			System.out.println(F(n));
		}
		else{
			System.out.println("�������������Χ");
		}
	}
	
	public static int F(int n){
		int f = 0;
		if (n == 0) {
			f = 0;
		}else if(n == 1){
			f = 1;
		}else{
			f = F(n-1) + F(n-2);
		}
		
		return f;
	}
}
