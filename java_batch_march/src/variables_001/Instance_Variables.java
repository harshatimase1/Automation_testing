package variables_001;

public class Instance_Variables {
	
	
	//datatype variable=value;
	
     //Instance variable:Inside the class and outside the method
	
	int a=67;
	
	public void test() {
		//we need not to create object for instance variable to access in the instance method
		System.out.println(a);
		

	}
	public static void login() {
		
		Instance_Variables d=new Instance_Variables();
		System.out.println(d.a);
		
	}
	
	public static void main(String[] args) {
		Instance_Variables d=new Instance_Variables();
		d.test();
		login();
		
	}

}
