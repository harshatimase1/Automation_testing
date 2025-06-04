package conditional_satement;

public class SwitchString {

	public static void main(String[] args) {

		// print week number on the basic of week name

		String week_name = "None";

		switch (week_name) {
		case "Saturday":
			System.out.println("Week Number is :" + 2);
			break;
		case "Monday":
			System.out.println("Week Number is :" + 3);
			break;
		case "Tueday":
			System.out.println("Week Number is :" + 4);
			break;
		case "Wednesday":
			System.out.println("Week Number is :" + 5);
			break;
		case "Thirsday":
			System.out.println("Week Number is :" + 6);
			break;
		case "Friday":
			System.out.println("Week Number is :" + 7);
			break;
		case "Sunday":
			System.out.println("Week Number is :" + 1);
			break;
		default:
			System.out.println("Invalid week number");
			break;

		}

	}

}
