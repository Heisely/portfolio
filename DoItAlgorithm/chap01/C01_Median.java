package DoItAlgorithm.chap01;

import java.util.Scanner;

// 실습 1C-1. 3개의 정수값을 입력하고 중앙값을 구한 다음 출력
public class C01_Median {
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) { // a>=b>=c
				return b;
			} else if (a <= c) { // c>=a>=b
				return a;
			} else { // a>c>b
				return c;
			}
		} else if (a > c) { // b>a>c
			return a;
		} else if (b > c) { // b>c>=a
			return c;
		} else { // c>=b>a
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
}
