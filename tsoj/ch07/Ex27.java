package tsoj.ch07;

// InterfaceTest

/* InterfaceTest2 참고: 클래스 A를 작성하는데 클래스 B가 관련하지 않았다는 사실에 주목 */
class A {
	public void methodA(B b) {
		b.methodB();
	}

	/* InterfaceTest2 */
	void autoPlay(I i) {
		i.play();
	}

	/* InterfaceTest3 */
	void methodA() {
		I i = InstanceManager.getInstance(); // 제3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
		i.methodB();
		System.out.println(i.toString()); // i로 Object클래스의 메서드 호출 가능
	}
}

class B implements I {
	public void methodB() {
		/* InterfaceTest */
		System.out.println("methodB()");
		/* InterfaceTest3 */
		System.out.println("methodB in B class");
	}

	/* InterfaceTest2 */
	public void play() {
		System.out.println("play in B class");
	}

	/* InterfaceTest3 */
	public String toString() {
		return "class B";
	}
}

public class Ex27 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}
}
