package few_java_topics;

public class Variables {
	static int a = 28;
	
// Instance method--Outside of main method--Access modifier return type name of method name (){}block of code}

	public void login() {
		//float p = 28.23f;
		//System.out.println(p);
		
		System.out.println(a);
	}

	// Static method--static keyword -Access modifier static return type method name(){block of code}
	public static void upload() {
		//short m = 67;
		//System.out.println(m);
		
		//Variables v = new Variables();
		System.out.println(a);
		
	}

	public static void main(String[] args) {

		// Create object to access "a" which is outside of main method class name ref_variable= new class name

		Variables s = new Variables();

		System.out.println(Variables.a);
		System.out.println(a); 
		
		String test_1="Automation";
		String test_2="Testing";

		// Concatination is the process of joining character,string end to end
		System.out.println(test_1+"  "+ test_2);

		// To call or access instance method in the main method we use reference_variable.method name();
		s.login();

		// To access static method --method name();
		upload();
    
	}

}
