package scannerClass;

import java.util.Scanner;

public class ScannerAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value :");
		int a = sc.nextInt();
		
	
		boolean d = sc.nextBoolean();
		
		System.out.println("Enter second value :");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Addition of two numbers :"+c);

		
	}

}
