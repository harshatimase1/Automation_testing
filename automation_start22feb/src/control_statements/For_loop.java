package control_statements;

public class For_loop {

	public static void main(String[] args) {
		// syntax--for(Initialize variable; condition; increment/decrement){sysout
		// statement}//
		System.out.println("=========NUMBER FROM 1 TO 10===========");

		for (int a = 1; a < 11; ++a) {
			System.out.println(a);
		}

		System.out.println("=========NUMBER FROM 50 TO 2===========");
		for (int z = 50; z >1; --z) {
			System.out.println(z);

		}
		System.out.println("=========  EVEN NUMBERS FROM 2 TO 100===========");

		for (int j = 1; j <= 100; ++j) {
			if (j % 2 == 0) {
				System.out.println(j);
			}

		}
		System.out.println("=========EVEN NUMBERS FROM 100 TO 2==========");

		for (int x = 100; x >= 1; --x) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}
		System.out.println("=========ODD NUMBERS FROM 1 TO 50===========");

		for (int s = 1; s <= 50; ++s) {
			if (s % 2 !=0 ){
				System.out.println(s);
			}
		}
		System.out.println("=========ODD NUMBERS FROM 50 TO 1===========");
		for (int w = 50; w >= 1; --w) {
			if (w % 2 != 0) {
				System.out.println(w);
			}

		}

		
	}

}