package DoItAlgorithm.chap03;

// 실습 3C-2. 자연스러운 정렬을 하기 위한 클래스 정의(A.java 확인 꼭!)
public class C02_A implements Comparable<C02_A> { // Comparable<C02_A>인터페이스 구현
	// 필드 메서드 등
	
	public int compareTo(C02_A c) { // compareTo 메서드 구현
		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 반환
		// this가 c와 같으면 0 반환
		return 0; // 수정 필수!!!
	}
	
	public boolean equals(Object c) { // equals 메서드 구현
		// this가 c와 같으면 true 반환
		// this가 c와 같지 않으면 false 반환
		return true; // 수정 필수!!!
	}
}
