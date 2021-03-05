package DoItAlgorithm.chap03;

import java.util.Scanner;

// 실습 3-2. 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
// 실습 3-1(A01_SeqSearch 개선)
public class A02_SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++)
			if (a[i] == key)
				return i; // 검색 성공!(인덱스 반환)
		return -1; // 검색 실패!(-1을 반환)
	}

	// 확실하지는 않음. Do it! Algorithm 전체 소스 확인할 것.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요소수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값: "); // 키 값을 입력
		int ky = stdIn.nextInt();

		int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
