package com.shijiacheng;

import java.util.Scanner;

/**
 * 判断质数 对于大于1的数，如果除了1和它本身，它不能再被其它 ，那么我们说它是一个质数。晓萌想判断一个数是不是质数，希望找你写个程序，帮助她进行判断。
 * 输入包括一行，为一个整数N（1 < N ≤1000），正是晓萌给出你让你判断的数字。
 * 输出包括一行，如果晓萌给出的整数N为质数，那么输出YES；如果N不是质数，那么输出NO。
 * 
 * 样例1 输入： 3 输出： YES
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
			System.out.println("输入的数超出了范围");
		}
	}
}
