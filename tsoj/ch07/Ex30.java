package tsoj.ch07;

/*
# Default Method
추상 메서드의 기본적인 구현을 제공하는 메서드로, 추상 메서드가 아니기 때문에 디폴트메서드가 새로 추가되어도 해당 인터페이스를 구현한 클래스를 변경하지 않아도 된다.
디폴트 메서드는 앞에 키워드 default를 붙이며, 추상 메서드와 달리 일반 메서드처럼 몸통{}이 있어야한다.
디폴트 메서드 역시 접근 제어자가 public이며, 생략 가능하다.

# Default Method 충돌 해결 규칙
1. 여러 인터페이스의 디폴트 메서드 간의 충돌
	> 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
	> 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
 */
// DefalutMethodTest
class Parents {
	public void method2() {
		System.out.println("method2() in Parents");
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in Myinterface");
	}

	default void method2() {
		System.out.println("method2() in Myinterface");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Childs extends Parents implements MyInterface, MyInterface2 {
	@Override
	public void method1() {
		System.out.println("method() in Childs"); // 오버라이딩
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Childs c = new Childs();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}
