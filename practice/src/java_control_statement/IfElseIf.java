package java_control_statement;

public class IfElseIf {

	public static void main(String[] args) {

		int num = 0;
		if (num > 5) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		System.out.println("---------------Print Weeks----------------------------");

		int weekno = 10;
		if (weekno == 1) {
			System.out.println("Sunday");
		} else if (weekno == 2) {
			System.out.println("Monday");
		} else if (weekno == 3) {
			System.out.println("Tuesday");
		} else if (weekno == 4) {
			System.out.println("Wednesday");
		}
		else if (weekno == 5) {
			System.out.println("Thirsday");
		} else if (weekno == 6) {
			System.out.println("Friday");
		} else if (weekno == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid week day");
		}

		
		
		System.out.println("------------------Largest Number-------------------------");

		int a = 100;
		int b = 200;
		int c = 300;

		if (a > b && a > c) {
			System.out.println("a is largest ");
		} else if (b > a && b > c) {
			System.out.println("b is largest");
		} else {
			System.out.println("c is largest");
		}

		System.out.println("---------------------------------------");

		if (true) {
			System.out.println(1);
		}

		else {
			System.out.println(2);
		}

		System.out.println("---------------------------------------");

		if (1 == 2) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

		
		System.out.println("---------------Display city names-----------------------") ;
		
		String city="Wardha";
		
		if(city=="Wardha") {
			System.out.println("City is Wardha");
		
		}else if(city=="Nagpur") {
			System.out.println("City is Wardha");
		}
		else if(city=="Akola") {
			System.out.println("City is Akola");
		}else {
			System.out.println("None of the above");
		}
	
	}

}
