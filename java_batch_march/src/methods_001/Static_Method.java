package methods_001;

public class Static_Method {

	//Static method/user defined method
	
	public static void automation() {
		
		int a=90;
		char j='s';
		String u="Automation";
		
		System.out.println(u);
		System.out.println(a);
		System.out.println(j);
		
	}

	
	public static void main(String[] args) {
		//Directly we can access with the help of method name
		automation();
		
		//classname.nameofthemethod
		
		System.out.println("===========================");
		Static_Method.automation();
		
		
	}

}
