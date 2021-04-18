package tsoj.ch07;

// InterfaceTest2
interface I {
	public abstract void play();
	
	/* InterfaceTest3 */
	public abstract void methodB();
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
	
	/* InterfaceTest3 */
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
}

public class Ex28 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B()); // void autoPlay(I i) 호출
		a.autoPlay(new C()); // void autoPlay(I i) 호출
	}
}
