package tsoj.ch07;

// PolyArgumentTest3
public class Ex23 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv2 tv = new Tv2();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
