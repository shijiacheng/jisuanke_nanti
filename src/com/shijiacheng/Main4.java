package com.shijiacheng;

import java.util.Scanner;

/**
 * 斐波那契数列是一种非常有意思的数列，由 0 和 1 开始，之后的斐波那契系数就由之前的两数相加。用数学公式定义斐波那契数列则可以看成如下形式：
 * 
 * F0=0
 * F1=1
 * Fn=Fn-1+Fn-2
 * 
 * 我们约定Fn表示斐波那契数列的第n项，你能知道斐波那契数列中的任何一项吗？
 * 输入包括一行，包括一个数字N（0≤N≤50）。
 * 输出包括一行，包括一个数字，为斐波那契数列的第N项的值。
 * 样例1
 * 输入：
 * 7 输出：
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
			System.out.println("输入的数超出范围");
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
