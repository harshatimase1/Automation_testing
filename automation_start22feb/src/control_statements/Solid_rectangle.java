package control_statements;

public class Solid_rectangle {

	public static void main(String[] args) {

		/*
		 * Outer loop define the rows and inner loop define the columns
		 * 
		 * Solid rectangle is the type of nested loop, solid loop contains 4 rows and 5
		 * columns
		 * 
		 * 
		 * here we can print * and numbers. syntax- for(initialize
		 * variables;condition;increment) { for(initialize variables; conditions;
		 * increment) //block of code}
		 * system.out.print(" ")
		 * } //block of code }
		 */

		for (int a = 1; a < 5; a++) {
			for (int b = 1; b < 6; ++b) {
				System.out.print("* ");
			}

			System.out.println(" ");

		}
	}
}
