package scannerClass;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("The addition of 2 number is :"+c);
		

	}

}
