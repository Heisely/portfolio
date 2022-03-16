package backJoon.step01;

/**
 * #10869
 * 
 * 문제> 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 * 
 * 입력> 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 
 * 출력> 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 * 
 * */

import java.util.Scanner;

public class No09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 시스템 입력
		
		int a = sc.nextInt(); // 첫 번째 자연수
		int b = sc.nextInt(); // 두 번째 자연수
		
		sc.close();
		
		System.out.println(a+b); // 합
		System.out.println(a-b); // 차
		System.out.println(a*b); // 곱
		System.out.println(a/b); // 몫
		System.out.println(a%b); // 나머지
	}
}
