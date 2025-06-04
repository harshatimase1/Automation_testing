package conditional_satement;

public class NestedIf01 {

	public static void main(String[] args) {
		
		int a=5;
		
		if(a>4) {
			System.out.println("Value of a is greater than 6");

			if(a<10) {
				System.out.println("Value of a is less than 5");
				if(a<15) {
					System.out.println("Value of a is greater than 10");

					if(a<4) {
						System.out.println("Value of a is greater than equals to 5");

				}

			}

		}
			
		}else {
			System.out.println("None");
			
		}

	}

}
