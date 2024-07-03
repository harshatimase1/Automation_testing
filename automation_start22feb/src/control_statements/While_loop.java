package control_statements;

public class While_loop {

	public static void main(String[] args) {

		/*
		 * syntax of while loop-- initialize variable; while(condition) { //block of
		 * code to be executed increment/decrement }
		 */

		System.out.println("===========Numbers from 25 to 50============================");

		int a = 25;
		while (a <= 50) {
			System.out.println(a + " ");
			++a;
		}
		{

			System.out.println("===========Numbers from 50 to 1============================");
		}

		int b = 50;
		while (b >= 1) {
			System.out.println(b);
			--b;
		}
		System.out.println("===========Even numbers from 1 to 50============================");
		int c = 1;
		while (c < 50) {

			if (c % 2 == 0) {
				System.out.println(c);
			}
			++c;
		}

		System.out.println("===========ODD numbers from 1 to 50============================");

		int d = 1;
		while (d < 50) {

			if (d % 2 != 0) {
				System.out.println(d);
			}
			++d;
		}
		System.out.println("==========Even Numbers from 1 to 50 in another way============================");
		int e = 1;
		while (e <= 25) {
			System.out.println(2 * e);
			++e;
		}

		System.out.println("==========ODD Numbers from 0 to 50 in another way============================");

		int h = 0;
		while (h <= 25) {
			System.out.println(2 * h + 1);
			++h;
		}

		System.out.println("==========Even Numbers from 100 to 2 in another way============================");
		int j = 50;
		while (j >= 1) {
			System.out.println(2 * j);
			--j;
		}
	}

}
