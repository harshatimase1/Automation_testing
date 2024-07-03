package control_statements;

public class If_elseIf {
	
	
	
	public static void main(String[] args) {
		String city="Pune";
		//if(Condition){execute block of code when condition is true}
   if(city=="Mumbai"){
	   System.out.println("The city is Mumbai");
	}
   else if (city=="Nagar") {
	   System.out.println("The city is Nagar");
   }
   else if (city=="Hyderabad"){
	   System.out.println("The city is Hyderabad");
	   }
   else if(city=="Delhi") {
	   System.out.println("The city is Delhi");
	    }
   //else(Executes code when all above conditions are false)
   else {
	   System.out.println("None of the above");
	   }
   }
	}
