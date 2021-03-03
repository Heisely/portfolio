package DoItAlgorithm.chap02;

import java.util.Random;
import java.util.Scanner;

// 실습 2-5. 배열 요소의 최댓값(난수 생성)
public class A05_MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random(); // Random 클래스형의 변수를 만들기 위한 선언
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = stdIn.nextInt(); // 배열의 요소수를 입력 받음

		int[] height = new int[num]; // 요소수가 num인 배열 생성

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			// 변수 rand에 대한 난수를 생성하는 메서드(nextInt(n): 0 ~ n-1)호출
			height[i] = 100 + rand.nextInt(90); // 요소의 값을 난수로 결정
			System.out.println("height[" + i + "]: " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
