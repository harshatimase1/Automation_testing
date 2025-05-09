package java_control_statement;

public class If_else {

	public static void main(String[] args) {
		short q=90;
		short w=100;
		
		if(q<w) {
			System.out.println("Output of above condition is true");
		}
		else {
			System.out.println("Output of above condition is true");
			
		}
		
		System.out.println("------------------------------------------------");
		
		
		int a=40;
		long p=60;
		
		
		if(a>p&&p!=a) {
			System.out.println("Comparison Output is false");
			
		}else {
			
			System.out.println("Comparison Output is true");
		}
		
			
			System.out.println("----------------------------------");
		if (p<a) {
			
			System.out.println("False");
		} else {

			System.out.println("True");
		}
		
		System.out.println("--------------------------");
		
		String city="pune";
		
		if(!(city=="pune")) {
			
			System.out.println("City is pune");
		}
		
		else {
			System.out.println("City is nagpur");
			
		}
		
		
	}

}
