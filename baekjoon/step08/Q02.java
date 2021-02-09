package baekjoon.step08;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int n = 1;

		if (a == 1) {
			System.out.println(a);
		} else {
			while (true) {
				if (3*n*(n-1)+2 <= a && a <= 3*n*(n+1)+1) {
					System.out.println(n + 1);
					break;
				}
				n++;
			}
		}
	}
}
