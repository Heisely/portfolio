package backJoon.step01;

/**
 * #10998
 * 
 * 문제> 두 정수 A와 B를 입력받은 다음, AxB를 출력하는 프로그램을 작성하시오.
 * 
 * 입력> 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력> 첫째 줄에 AxB를 출력한다.
 * 
 * */

import java.util.Scanner;

public class No07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 시스템 입력
		
		int a = sc.nextInt(); // 첫 번째 입력 정수값
		int b = sc.nextInt(); // 두 번째 입력 정수값
		
		sc.close(); // Scanner close
		
		System.out.println(a*b);
		
	}
}
