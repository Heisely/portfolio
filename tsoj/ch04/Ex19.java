package tsoj.ch04;

// FlowEx19. 중첩 for문(4)
public class Ex19 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.println("" + i + j + k);
				}
			}
		}
	}
}
