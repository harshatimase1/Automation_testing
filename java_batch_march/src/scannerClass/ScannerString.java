package scannerClass;

import java.util.Scanner;

public class ScannerString {
	

	public static void main(String[] args) {
		// Banking project

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String ");
		String a = sc.nextLine();
		System.out.println("Enter second String ");
		String b = sc.nextLine();

		
		
		System.out.println("Output as follows " + a.concat(b));

	}

}
