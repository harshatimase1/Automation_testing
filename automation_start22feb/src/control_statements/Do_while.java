package control_statements;

public class Do_while {

	public static void main(String[] args) {
		/*
		 * Syntax initialize variable; do{ block of code increment/decrement; }
		 * while(condition);
		 */
		int t = 22;
		do {
			System.out.println(t);

			++t;
		} while (t >= 50);

		System.out.println("==============Even number from 1 to 20===================");

		int j = 1;
		do {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			++j;
		} while (j <= 20);

		System.out.println("==============If initialize value is greater than specified condition===================");

		int h = 25;
		do {

			System.out.println(h);
			++h;

		} while (h >= 30);
	}

}
