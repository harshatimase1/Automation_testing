package java_control_statement;

public class NestedIfStatement {

	public static void main(String[] args) {

		int a = 100;

		if (a<50) {
			System.out.println("Value of a is greater than 50");
			if (a<75) {
				System.out.println("Value of a is greater than 75");

				if (a>200) {
					System.out.println("Value of a is less than 200");

					if (a>200) {
						System.out.println("Value of a is greater than 50");

						if (a>800) {
							System.out.println("Value of a is greater than 80");


						}

					}

				}

			}

		}else {
			System.out.println("All the above statements are false");
		}

	}

}
