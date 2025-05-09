package looping_statements;

public class Do_Wlile_Loop {

	public static void main(String[] args) {

		// Example:Print 1......10 Number
		System.out.println("-----------Print 1to 10 ---------");
		int a = 1;
		do {
			System.out.println(a); // 1 2
			a++;// 2 3
		} while (a <= 10); // 2 3

		System.out.println("--------------Print 10 to 1------------");

		int b = 10;
		do {
			System.out.println(b);
			b--;
		}

		while (b >= 1);

		System.out.println("--------------Print Even Number------------");
		int c = 0;
		do {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		} while (c <= 25);
		System.out.println("");
		System.out.println("-------------------");

		System.out.println("--------------STP Infotech---------");
		int d = 10;
		do {
			System.out.println("STP Infotech");
			d++;
		} while (d <= 5);

		System.out.println("--------------Print 1 odd,2even,3 odd like wise---------");

		int e = 1;
		do {
			if (e % 2 == 0) {
				System.out.println(e + " Even Number");
			} else {
				System.out.println(e + "  Odd Number");
			}
			e++;

		} while (e <= 10);

		System.out.println("--------------Even Number by using binary operator---------");
		int f = 0;
		do {
			System.out.println(f);
			f+=2;
		} while (f <= 20);

	}

}
