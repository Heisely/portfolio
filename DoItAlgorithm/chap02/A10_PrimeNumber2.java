package DoItAlgorithm.chap02;

// 실습 2-10. 1,000 이하의 소수를 열거(버전 2)
public class A10_PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2; // 2는 소수임 >> prime[1] = 2;

		for (int n = 3; n <= 1000; n += 2) { // 홀수만 대상
			int i;
			for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어 봄
				counter++;
				if (n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
					break; // 따라서 더 이상의 반복은 불필요
			}
			if (ptr == i) // 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n; // 소수이므로 배열의 저장
		}

		for (int i = 0; i < ptr; i++) // 찾은 ptr개의 소수를 나타냄
			System.out.println(prime[i]);

		System.out.println("나눗셈을 수행한 횟수: " + counter);
	}
}
