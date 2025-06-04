package loopingStatements;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		// 1 to 5
		System.out.println("---Using While loop-----");

		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		 //System.out.println("---Using DoWhile loop-----");
		 System.out.println("\n");
		int b = 1;
		do {
			System.out.println(b);
			b++;
		} while (b <= 5);

	}

}
