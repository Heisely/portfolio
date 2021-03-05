package DoItAlgorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

// 실습 3-5. Arrays.binarySearch로 이진 검색
public class A05_BinarySearchTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요소수가 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: "); // 첫 요소 입력
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("검색할 값: "); // 키 값 입력
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 ky인 요소 검색

		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
