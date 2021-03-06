package tsoj.ch03;

// OperatorEx31
public class Ex31 {
	public static void main(String[] args) {
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex = %X\n", hex);
		System.out.printf("%X\n", hex & mask);

		hex = hex >> 4; // hex*(2^4)
		System.out.printf("%X\n", hex & mask);

		hex = hex >> 4; // hex*(2^4)
		System.out.printf("%X\n", hex & mask);

		hex = hex >> 4; // hex*(2^4)
		System.out.printf("%X\n", hex & mask);
	}
}
