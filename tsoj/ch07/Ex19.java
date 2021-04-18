package tsoj.ch07;

// BindingTest2
class Child4 extends Parent2 {}

public class Ex19 {
	public static void main(String[] args) {
		Parent2 p = new Child4();
		Child4 c = new Child4();

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}
}
