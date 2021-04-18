package tsoj.ch07;

import java.util.Vector;

// PolyArgumentTest - 매개변수의 다형성
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 제품 가격의 10%
	}

	// PolyArgumentTest2에서 생성
	Product() { // 기본 생성자
		/* PolyArgumentTest3 */
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product {
	Tv2() {
		// 조상클래스의 생성자 Product (int price)를 호출
		super(100); // Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩
	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 보너스 점수

	/* PolyArgumentTest2 에서 사용할 조건 추가 */
	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열에 사용될 카운터

	/* PolyArgumentTest3 에서 사용할 조건 추가 */
	Vector vitem = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.

		/* PolyArgumentTest2 에서 사용할 조건 추가 */
		item[i++] = p; // 제품을 Product[] item에 저장한다.

		/* PolyArgumentTest3 에서 사용할 조건 추가 */
		vitem.add(p);

		System.out.println(p + "을/를 구입하셨습니다.");
	}

	/* PolyArgumentTest3 에서 사용할 조건 추가 */
	void refund(Product p) { // 구입한 제품을 환불한다.
		if (vitem.remove(p)) { // 제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else { // 제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 상품이 없습니다.");
		}
	}

	/* PolyArgumentTest2 에서 사용할 조건 추가 */
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0; // 구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품 목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.(PolyArgumentTest2)
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");

		/* PolyArgumentTest3 에서 사용할 조건 추가 */
		if (vitem.isEmpty()) { // Vector가 비어있는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.(PolyArgumentTest2)
		for (int i = 0; i < vitem.size(); i++) {
			Product p = (Product) vitem.get(i); // Vector의 i번째에 있는 객체를 얻어온다.
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}

}

public class Ex21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv2());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
	}
}
