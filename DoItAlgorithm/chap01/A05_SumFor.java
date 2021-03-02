package DoItAlgorithm.chap01;

import java.util.Scanner;

// 실습 1-5. 1,2,...,n의 합(For문)
public class A05_SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = stdIn.nextInt();

		int sum = 0; // 합

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
