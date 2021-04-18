package tsoj.ch07;

// BindingTest3
class Child5 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("x = " + x); // this.x와 같다
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class Ex20 {
	public static void main(String[] args) {
		Parent2 p = new Child5();
		Child5 c = new Child5();

		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
