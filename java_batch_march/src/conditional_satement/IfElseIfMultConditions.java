package conditional_satement;

public class IfElseIfMultConditions {

	public static void main(String[] args) {
		// print week number on the basic of week name
		
		String week_name = "Sunday";
		

		if (week_name == "Saturday") {

			System.out.println(1);
		} else if (week_name == "Monday") {
			System.out.println(2);
		} else if (week_name == "Tueday") {
			System.out.println(3);
		} else if (week_name == "Wednesday") {
			System.out.println(4);
		} else if (week_name == "Thirsday") {
			System.out.println(6);
		} else if (week_name == "Sunday") {
			System.out.println(6);
		} else if (week_name == "Sunday") {
			System.out.println(6);
		} else {
			System.out.println("Invalid week day");
		}

	}

}
