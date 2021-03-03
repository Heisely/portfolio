package DoItAlgorithm.chap02;

// 실습 2-2. 구성 자료형이 int형인 배열(구성 요소수는 5: 배열 초기자에 의해 생성)
public class A02_IntArrayInit {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 }; // 배열 초기자에 의해 생성

		for (int i = 0; i < a.length; i++) { // 각 요소의 값을 나타냄
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
