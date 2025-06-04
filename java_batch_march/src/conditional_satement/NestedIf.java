package conditional_satement;

public class NestedIf {

	public static void main(String[] args) {
		int a=100;
		
		String city="Nagpur";
/*
		if(a>50) {
		
			System.out.println("Value of a is greater than 50");
			if(a<75) {
				System.out.println("Value of a is greater than 75");
				if(a>80) {
					System.out.println("Value of a is greater than 80");
					if(a>90) {
						System.out.println("Value of a is less than 90");
						
					}
			
				}
			
			}
	
		
		}else {
			System.out.println("None of the above condition is matching ");

		}*/
		
		if(city=="Nagpur") {
			System.out.println("City is Nagpur");
			if(city=="Nagpur") {
				System.out.println("City is wardha");
				if(city=="Pune") {
					System.out.println("City is Pune");
				}
				
			}
			
		}
		
		else {
			System.out.println("None");
		}
	
	}

}
