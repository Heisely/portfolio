package tsoj.ch07;

// InterfaceTest3
class InstanceManager {
	public static I getInstance() {
		return new B();
	}
}

public class Ex29 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}
