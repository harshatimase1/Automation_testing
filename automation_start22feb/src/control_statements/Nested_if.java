package control_statements;

public class Nested_if {

	public static void main(String[] args) {
		float p = 100.50f;
		/*
		 * if (p > 50.50) { System.out.println("output > 50.50"); } if (p < 200) {
		 * System.out.println("Output <200");
		 * 
		 * if (!(p == 100.50)) { System.out.println("Output equal to p");
		 * 
		 * if (p > 45.23) { System.out.println("Output greater than p");
		 * 
		 * if (p < 150.50) { System.out.println("Output less than "); } } } } } else{
		 * System.out.println("All above specified conditions are false"); } }
		 */

		if (p < 10) {
			System.out.println("Output");

			if (p == 100.50) {
				System.out.println("Output 1");
				if (p < 90) {
					System.out.println("Output3");
					if (!(p == 90)) {
						System.out.println("Output4");
					}

				}

			}
		}

		else {
			System.out.println("Output5");
		}
	}
}
