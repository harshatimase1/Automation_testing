package java_control_statement;

public class IfElseCondition {

	public static void main(String[] args) {
		int person_age = 25;
		
		if(person_age>=18) {
			
			System.out.println("Eligible for vote");
		}

		else {
			System.out.println("Not eligible for vote");
		}
		
		System.out.println("---------------------Even odd number-----------------------------------");
		
		int num=10;
		if(num%2==0) {
			System.out.println("Even number");
			
		}
		else {
			System.out.println("Odd number");
		}
		
		System.out.println("------------------------------");
		int num1=15;
		if(num1%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
		
	}

}
