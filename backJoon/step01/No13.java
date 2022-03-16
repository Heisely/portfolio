package backJoon.step01;

/**
 * #2588
 * 
 * 문제> 
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * (상세문제 백준 단계별 13번 참고)
 * 
 * 입력> 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 
 * 출력> 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 
 * */

import java.util.Scanner;

public class No13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 시스템 입력
		
		int a = sc.nextInt(); // 세 자리 자연수
		int b = sc.nextInt(); // 세 자리 자연수
		
		sc.close();
		
		// (3): a * (b의 일의 자리 수)
		System.out.println(a * (b%10)); 
		// (4): a * (b의 십의 자리 수)
		System.out.println(a * ((b/10)%10)); 
		// (5): a * (b의 백의 자리 수)
		System.out.println(a * (b/100)); 
		// (6): a * b
		System.out.println(a * b);
	}
}
