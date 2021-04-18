package tsoj.ch07;

// PolyArgumentTest2
class Audio extends Product {
	Audio() {
		super(50);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

/* Ex21에 PolyArgumentTest2 에서 사용할 조건 추가 */
public class Ex22 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}
