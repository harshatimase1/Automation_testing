
package conditional_satement;

public class IfElseIfStatement {

	public static void main(String[] args) {

		// example
		// a,b,c
		// a is the largest
		// b is the largest
		// c is the largest number
		
		

		int a = 300;
		int b = 200;
		int c = 400;

		if (a > b && a > c) {
			System.out.println("a is the largest");
		} else if (b < a&& b > c) {
			
			System.out.println("b is the largest");
			

		} else {
			System.out.println("c is the largest number");

		}

		
	}

}
