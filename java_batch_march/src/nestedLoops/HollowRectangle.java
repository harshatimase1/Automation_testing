package nestedLoops;

public class HollowRectangle {

	public static void main(String[] args) {

		// outer loop--row-1 to 4 --inner loop--column--1 to 5

		/*
		 * for (int a = 1; a <= 4; a++) {
		 * 
		 * for (int b = 1; b <= 5; b++) { if (a == 1 || a == 4 || b == 1 || b == 5) {
		 * System.out.print("* ");
		 * 
		 * } else { System.out.print("  "); }
		 * 
		 * }
		 */
		
		for (int c = 1; c <= 4; c++) {

			for (int d = 1; d <= 5; d++) {
				if (c == 1 || c == 4 || d == 1 || d == 5) {
					System.out.print(d+" ");
				}

				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
	}
}
