package java_control_statement;

public class IfElseLargestNumber {

	public static void main(String[] args) {

		int a = 500;
		int b = 100;

		if (a > b) {
			System.out.println("a is the largest number");
		}

		else {
			System.out.println("b is the largest number");
		}

		System.out.println("----------------------------------------");
		
		int a1=100;
		int b1=500;
		if(a1>b1) {
			System.out.println("a is the largest number");
		}
		else {
			System.out.println("b is the largest number");
		}
		
		System.out.println("---------------------------Smallest Number----------------------");
		int c=80;
		int d=90;
		if(c<d) {
			System.out.println("c is the smallest number : "+c);
		}
		else {
			System.out.println("d is the smallest number : "+d);
		}
	}

}
