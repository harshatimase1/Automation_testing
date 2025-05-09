package array;

import java.util.Scanner;

public class TakingMultipleInputsFromConsole {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		System.out.println("Addition of two numbers :"+(num1+num2));
		
		System.out.println("Enter name:");
		String name=sc.next();	
		System.out.println("Your name is :"+name);
		
		System.out.println("Enter age :");
		String age=sc.next();	
		
		System.out.println("Your age is :"+age);
		
		System.out.println("Enter unknown number :");
		Object value=sc.next();
		
		System.out.println(value);
	}

}
