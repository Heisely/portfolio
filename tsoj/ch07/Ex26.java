package tsoj.ch07;

// RepairableTest
interface Repairable {
}

class Units {
	int hitPoint;
	final int MAX_HP;

	Units(int hp) {
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Units {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Units {

	AirUnit(int hp) {
		super(hp);
	}

}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150); // Tank의 HP는 150
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}

	// ...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125); // Dropship의 HP는 150
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}

	// ...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	// ...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Units) {
			Units u = (Units) r;
			while (u.hitPoint != u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}

	// ...
}

public class Ex26 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();

		scv.repair(tank); // SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine); // error! repair(Repairable) in SCV cannot be applied to (Marine)
	}
}
