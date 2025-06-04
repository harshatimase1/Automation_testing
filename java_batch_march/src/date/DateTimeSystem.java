package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeSystem {

	public static void main(String[] args) {

//		Date d=new Date();
//		
//		System.out.println(d.toString());

		Date d = new Date();

		// dd-MM-yyyy
		// hh:mm:ss

		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println(s.format(d));

		System.out.println("----------------------------------");
		

		SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy   hh:mm:ss");

		System.out.println(s1.format(d));
		
		System.out.println("---------------------------------------");
		
		SimpleDateFormat s2 = new SimpleDateFormat(" hh:mm:ss ");
		System.out.println(s2.format(d));
		

	}

}
