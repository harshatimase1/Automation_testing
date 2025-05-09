
package nestedPatterns;

public class Half_pyramid {

	public static void main(String[] args) {
		// half pyramid--1 to 4 row
		System.out.println("--------------half pyramid ---------");

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------half pyramid with numbers-------------");

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		System.out.println("--------------half pyramid with numbers-------------");
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a + "" + b + " ");
			}
			System.out.println();
		}

		System.out.println("--------------half pyramid with matrix positions-------------");
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a + "," + b + "  ");
			}
			System.out.println();
		}
	}
}
