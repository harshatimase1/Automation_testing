package scannerClass;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("choose any of operators +,-,*,/");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':System.out.println("Addition of two numbers :"+(a+b));break;
		case '-':System.out.println("Subtraction of two numbers :"+(a-b));break;
		case '*':System.out.println("Multiplication :"+(a*b));break;
		case '/':System.out.println("Division :"+(a/b));break;
		default:System.out.println("None");break;
		
		}
		
		
		
	}

}
