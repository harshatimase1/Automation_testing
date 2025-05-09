package scannerClass;

import java.util.Scanner;

public class NextLineMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first value");

		String a = sc.nextLine();
		
		System.out.println("Enter second value");
		String b = sc.nextLine();
		
		String c = a.concat(b);
		System.out.println("Output is as :"+c);
		
	}

}
