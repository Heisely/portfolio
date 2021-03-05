package DoItAlgorithm.chap03;

// 실습 3C-3. 제네릭 클래스의 예
public class C03_GenericClassTester {
	// 제네릭 클래스의 파라미터를 T라고 작성
	static class GenericClass<T> {
		private T xyz;

		GenericClass(T t) { // 생성자
			this.xyz = t;
		}

		T getXyz() { // xyz반환
			return xyz;
		}
	}

	public static void main(String[] args) {
		// 다음과 같이 파라미터에 String을 넘길 수도 있고 Integer를 넘길 수도 있음
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}
}
