package tsoj.ch07;

// BindingTest - 참조변수와 인스턴스의 연결
/* 
메서드의 경우 조상 클래스의 메서드를 자손의 클래스에서 오바라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만,
멤버변수의 경우 참조변수의 타입에 따라 달라진다.
*/
class Parent2 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("ChildMethod");
	}
}

public class Ex18 {
	public static void main(String[] args) {
		Parent2 p = new Child3();
		Child3 c = new Child3();

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}
}