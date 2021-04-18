package tsoj.ch07;

// CastingTest2
public class Ex16 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car; // 컴파일은 OK. 실행시 에러 발생
		car2 = fe;
		car2.drive();
	}
}
