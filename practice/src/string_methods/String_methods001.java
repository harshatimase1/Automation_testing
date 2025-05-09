package string_methods;

import java.util.Arrays;

public class String_methods001 {

	public static void main(String[] args) {

		String a = "Stp Infotech";
		a.isEmpty();
		System.out.println("Output of isEmpty method is :" + a.isEmpty());

		System.out.println("-------------------isEmpty Method---------------------------");
		String b = "";
		System.out.println(b.isEmpty());

		System.out.println("-------------------length---------------------------");

		System.out.println("Output of length method is :" + a.length());

		System.out.println("-------------------replace---------------------------");

		String r = "Automation";
		System.out.println("Output of replace method is :" + r.replace("ion", "te"));

		System.out.println("-------------------indexof---------------------------");
		System.out.println("Output of indexof method is :" + r.indexOf("t"));

		System.out.println("-------------------char at---------------------------");

		System.out.println("Output of charat method is :" + r.charAt(4));

		System.out.println("-------------------substring---------------------------");

		String p = "Manual Project";
		System.out.println("Output of substring method is :" + p.substring(0));
		System.out.println("Output of substring method is :" + p.substring(6));
		System.out.println("Output of substring method is :" + p.substring(0, 6));
		System.out.println("Output of substring method is :" + p.substring(6, 14));

		System.out.println("-------------------concat---------------------------");

		System.out.println("Output of concat method is :" + p.concat(" And Automation project"));
		System.out.println("Output of concat method is :" + p + " " + "And Automation project");

		System.out.println("-------------------tolowercase---------------------------");

		String u = "ECOMMERCE";
		System.out.println("Output of lowercase method is :" + u.toLowerCase());

		System.out.println("-------------------touppercase---------------------------");

		String q = "api project";
		System.out.println("Output of touppercase method is :" + q.toUpperCase());

		System.out.println("-------------------contains---------------------------");
		String o = "Automation testing is faster than manual testing";

		System.out.println("Output of contains method is :" + o.contains("testing"));

		System.out.println("Output of contains method is :" + o.contains("Automation"));

		System.out.println("-------------------equals---------------------------");
		String v = "ECOMMERCE";
		String x = "ECOMMERCE";
		System.out.println("Output of contains method is :" + v.equals(x));

		String actual = "https:www.amazon.com";

		String expected = "https:www.amazon.com";
		System.out.println("Output of contains method is :" + actual.equals(expected));

		// trim
		String p01 = "                    Testing                  ";
		System.out.println(p01);
		System.out.print(p01.trim());
		System.out.print(" Software");
		System.out.println(" ");
		System.out.println("-------------------------------");
		String q01 = "    Fnctional      testing             ";
		System.out.println(q01.trim());

		System.out.println("--------Split Method from SDET Channel-------");

		// split method split the string into multiple parts based on delimeter

		String s = "abc@gmail.com";
		String a1[] = s.split("@");
		System.out.println(Arrays.toString(a1));// [abc,gmail.com]

		System.out.println(a1[0]);
		System.out.println(a1[1]);
		
		System.out.println("---Remove special symbols-----");
		
		String amount="$15,20,55";   //ex 152055
		
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",", "")); 
		
		//ex 2
		s="abc,123@xyz";   //abc,123,xyz
		
		String arr1[]=s.split(",");  //[abc 123@xyz]
		
		System.out.println(Arrays.toString(arr1)); 
		
			 String arr2[]=arr1[1].split("@");
			 System.out.println(Arrays.toString(arr2)); //[123 xyz]
			 
			 System.out.println(arr1[0]); //abc
			 System.out.println(arr2[0]); //123
			 System.out.println(arr2[1]);//xyz
			 
			 //ex 3
			 
			 s="abc 123";
			 String ar[]=s.split(" ");
			 System.out.println(Arrays.toString(ar));

	}

}
