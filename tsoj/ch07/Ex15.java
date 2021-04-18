package tsoj.ch07;

/*
# 제어자 조합 사용 시 주의해야 할 사항
1. 메서드에 static과 abstract를 함께 사용할 수 없다.
	> static메서드는 몸통이 있는 메서드에만 사용할 수 있기 때문이다.
2. 클래스에 abstract와 final을 동시에 사용할 수 없다.
	> 클래스에 사용되는 final은 클래스를확장할 수 없다는 의미이고 
	  abstract는 상속을 통해서 완성되어야 한다는 의미이므로 서로 모순되기 때문이다.
3. abstract메서드의 접근 제어자가 private일 수 없다.
	> abstract메서드는 자손클래스에서 구현해줘야 하는데 접근 제어자가 private이면 자손 클래스에서 접근할 수 없기 때문이다.
4. 메서드에 private와 final을 같이 사용할 필요는 없다.
	> 접근 제어자가 private인 메서드는 오바라이딩 될 수 없기 때문이다. 이 둘 중 하나만 사용해도 의미가 충분하다.
 */

// CastingTest1 - 참조변수의 형변환
public class Ex15 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe; 에서 형변환이 생략된 형태
//		car.water(); // 컴파일에러: Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car; // 자손타입 ← 조상타입
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { // 운전하는 기능
		System.out.println("drive, Brrr~");
	}

	void stop() { // 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물 뿌리는 기능
		System.out.println("water!!!");
	}
}