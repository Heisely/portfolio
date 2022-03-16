package backJoon.step01;

/**
 * #1008
 * 
 * 문제> 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력> 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력> 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 * 
 * */

import java.util.Scanner;

public class No08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 시스템 입력
		
		// 방법 1. 입력값을 double로 받기
		double a = sc.nextInt(); // 첫 번째 입력값
		double b = sc.nextInt(); // 두 번째 입력값
		
		System.out.println(a/b);
		
		// 방법 2. 입력 값을 정수로 받고 double로 형변환 후 계산하기
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println((double)c / (double)d);
		
		sc.close(); // Scanner close
	}
}
