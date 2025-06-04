package string_methods;

public class String_methods001 {

	public static void main(String[] args) {

		String a = "API Project";

		System.out.println("----isEmpty-----");

		System.out.println(a.isEmpty());

		String b = " ";
		System.out.println(b.isEmpty());

		System.out.println("----length-----");

		// length starts from 1
		System.out.println(a.length());

		// index starts from 0
		System.out.println(a.indexOf("P"));

		// replace method

		System.out.println(a.replace("API", "SQL"));
		System.out.println(a.replace("ct", "ction"));

		// chat at
		System.out.println(a.charAt(2));

		// tolowercase

		String o = "E-COMMERCE PROJECT";

		System.out.println(o.toLowerCase());

		// touppercase

		String o1 = "heathcare_project";
		System.out.println(o1.toUpperCase());

		// substring

		String q01 = "Software";

		System.out.println("The output of substring method is:" + q01.substring(0));
		System.out.println("The output of substring method is:" + q01.substring(1));
		System.out.println("The output of substring method is:" + q01.substring(4));

		System.out.println("The output of substring method is:" + a.substring(4));

		System.out.println("The output of substring method is:" + a.substring(3, 10));
		System.out.println("The output of substring method is:" + a.substring(0, 4));

		// concat(+)

		String p01 = "Loan origination";
		System.out.println(p01.concat(" System"));
		System.out.println(p01 + " System");

		// contains

		System.out.println(p01.contains("L"));
		System.out.println(p01.contains("o"));
		System.out.println(p01.contains("T"));

		// equals

		String e = "Abvie";
		String a1 = "ABvie";

		System.out.println(e.equals(a1));

		String w = "www.amazon.com";
		String l = "www.amazon.com";

		System.out.println(w.equals(l));
		
		System.out.println("The output of equalsIgnorecase :"+(e.equalsIgnoreCase(a1)));
		
		System.out.println(w.endsWith("com"));
		
		System.out.println(a1.endsWith("B"));
		
		System.out.println(a1.endsWith("ie"));
		
		System.out.println(a1.endsWith("Bvie"));
		
		String z="           Automation                   ";

		System.out.println(z.trim());
		
		String l1="            Non Accesible        ";
		
		//System.out.println(l1.trim());

		String a01=l1.trim();
		//System.out.println(a01.endsWith(" "));
		
		String d="Non Accesible";
		System.out.println(a01.equals(d));
		
		//System.out.println("The output of l1 is :" +a01.length());
		
	
		//System.out.println(l1.trim().length());
	
		//System.out.println(l1.length());
		

	}

}
