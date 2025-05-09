
package nestedPatterns;

public class Hollow_Rectangle {

	public static void main(String[] args) {
////hollow rectangle--row 4--outer loop(1-4) --column--inner loop--5(1-5)
//d--row--1 to 4
//e--column--1 to 5
		for (int d = 1; d <= 4; d++) {
			for (int e = 1; e <= 5; e++) {
				if (d == 1 || d == 4 || e == 1 || e == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
