package DoItAlgorithm.chap01;

import java.util.Scanner;

// 실습 1-1. 3개의 정수값을 입력하고 최댓값 구하기
public class A01_Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값: "); int a = stdIn.nextInt();
		System.out.print("b의 값: "); int b = stdIn.nextInt();
		System.out.print("c의 값: "); int c = stdIn.nextInt();
		int max = a; // max에 a값을 넣는다.
		if (b > max) max = b; // b값이 max보다 크면 max에 b값을 넣는다.
		if (c > max) max = c; // c값이 max보다 크면 max에 c값을 넣는다.

		System.out.println("최댓값은 " + max + "입니다.");
	}
}
