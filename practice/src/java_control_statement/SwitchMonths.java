package java_control_statement;

public class SwitchMonths {

	public static void main(String[] args) {
		String monthname = "Dec";
//print month name on the basic of month number
		switch (monthname) {
		case "Jan":
			System.out.println(1);
			break;
		case "Feb":
			System.out.println(2);
			break;
		case "March":
			System.out.println(3);
			break;
		case "Apr":
			System.out.println(4);
			break;
		case "May":
			System.out.println(5);
			break;
		case "June":
			System.out.println(6);
			break;
		case "July":
			System.out.println(7);
			break;
		case "Aug":
			System.out.println(8);
			break;
		case "Sep":
			System.out.println(9);
			break;
		case "Oct":
			System.out.println(10);
			break;
		case "Nov":
			System.out.println(11);
			break;
		case "Dec":
			System.out.println(12);
			break;
		default:
			System.out.println("None of the above");
			break;

		}

	}

}
