package java_control_statement;

public class SwichWeekNumber {

	public static void main(String[] args) {
//print week number based on weekname(switch statement)

		String weekname = "Saturday";

		switch (weekname) {
		case "Sunday":
			System.out.println(1);
			break;
		case "Monday":
			System.out.println(2);
			break;
		case "Tuesday":
			System.out.println(3);
			break;
		case "Wendesday":
			System.out.println(4);
			break;
		case "Thirsday":
			System.out.println(5);
			break;
		case "Friday":
			System.out.println(6);
			break;
		case "Saturday":
			System.out.println(7);
			break;
		default:
			System.out.println("Invalid week number");
		}

	}

}
