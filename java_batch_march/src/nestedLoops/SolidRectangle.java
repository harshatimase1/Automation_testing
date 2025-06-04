
package nestedLoops;

public class SolidRectangle {

	public static void main(String[] args) {
		// Solid rectangle
		// Outer loop-row--1 to 4
		// inner loop-column--1 to 5

		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b <= 5; b++) {
				System.out.print("* ");
			}
			// System.out.println("\n");
			System.out.println();
		}

		System.out.println("----------------Row 4 Column 5-----------------------------");
		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b <= 5; b++) {
				System.out.print(b+" ");
			}
			// System.out.println("\n");
			System.out.println();
		}

		System.out.println("----------------Row 4 Column 5-----------------------------");
		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b <= 5; b++) {
				System.out.print(a+" ");
			}
			// System.out.println("\n");
			System.out.println();
		}
		
		System.out.println("----------------Row 4 Column 5-----------------------------");
		for (int a = 1; a <= 4; a++) {

			for (int b = 1; b <= 5; b++) {
				System.out.print(a+""+b+" ");
			}
			// System.out.println("\n");
			System.out.println();
		}
	}

}
