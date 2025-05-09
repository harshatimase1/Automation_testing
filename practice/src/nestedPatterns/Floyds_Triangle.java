package nestedPatterns;

public class Floyds_Triangle {

	public static void main(String[] args) {
		// row--5--column--5
		int c = 1;
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(c + " ");
				c++;

			}
			System.out.println();
		}
	}

}
