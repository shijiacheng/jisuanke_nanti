package com.shijiacheng;

import java.util.Scanner;

/*
 * 判断一个数是否能被另一个整数整除是一个挺简单的问题，一般一个模运算就可以搞定了，懒惰的晓萌还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。
 输入包括两个由空格分开的整数M和N（1≤M,N≤500）。
 输出包括一行，如果M可以被N整除就输出YES，否则输出NO（结果大小写敏感）。

 样例1
 输入：
 21 7
 输出：
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
			System.out.println("输入的数超出了范围");
		}

	}
}
