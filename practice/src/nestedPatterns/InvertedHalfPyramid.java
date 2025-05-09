package nestedPatterns;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		// half pyramid--row--4 to 1--column--1 to 4

		for (int a = 4; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------");
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for (int a = 4; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}

}
