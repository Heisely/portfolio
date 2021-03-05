package DoItAlgorithm.chap03;

import java.util.Scanner;

// 실습 3-3. 선형 검색(보초법)
public class A03_SeqSearchSen {
	// 요소수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key; // 보초 추가

		while (true) {
			if (a[i] == key) // 검색 성공!
				break;
			i++;
		}
		return i == n ? -1 : i; // "인덱스=n"이면 보초값을 찾은것이므로 참일 때는 -1 반환
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 요소수 num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색할 값: "); // 키 값을 입력
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
