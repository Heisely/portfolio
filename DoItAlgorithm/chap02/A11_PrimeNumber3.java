package DoItAlgorithm.chap02;

//실습 2-10. 1,000 이하의 소수를 열거(버전 3)
public class A11_PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0; // 곱셈과 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2; // prime[1] = 2, 2는 소수임
		prime[ptr++] = 3; // prime[2] = 3, 3은 소수임

		for (int n = 5; n <= 1000; n += 2) { // 5이상의 홀수만 대상
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2; // 다음 두 연산의 수행횟수를 계산하기 위함(곱셈: prime[i]*prime[i] / 나눗셈: n%prime[i])
				
				if (n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님
					flag = true;
					break; // 더이상의 반복은 불필요
				}
			}
			// prime[i]*prime[i] <= n이 성립하지 않으면 위 for문 루프에 포함되지 않음 >> 곱셈이 횟수에 포함되지 않음
			// 따라서 for문 종료 후 하단 if문에서 횟수 포함
			// 상단 if문에서 flag가 true가 될 때 곱셈의 횟수는 이미 포함되므로 flag가 false일 때(n이 소수인 경우)만 counter를 증가
			if (!flag) { // 마지막까지 나누어떨어지지 않음
				prime[ptr++] = n; // 소수라고 배열에 저장
				counter++;
			}
		}

		for (int i = 0; i < ptr; i++) // 찾은 ptr개의 소수를 출력
			System.out.println(prime[i]);

		System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
	}
}
