package DoItAlgorithm.chap01;

import java.util.Scanner;

// 실습 1-8. 왼쪽 아래가 직각인 이등변 삼각형 출력
public class A08_TriangleB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = stdIn.nextInt(); // 이등변 삼각형의 단 수를 입력
		} while (n <= 0); // n이 양수일 때까지 반복

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
