package scannerClass;

import java.util.Scanner;

public class ScannerChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int b = sc.nextInt();
		
		System.out.println("Table of 4 is as follow :");
		// table print 4
		for(int a=1;a<=10;a++) {
			
			System.out.println(b*a);
		}

	}

}
