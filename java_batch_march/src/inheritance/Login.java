package inheritance;



public class Login {
	
	//has -a -relationship
	
	int d=45;
	public void test() {
		System.out.println("Test");
		
	}
	

	public static void main(String[] args) {
		//object of parent class
		Username u=new Username();
		System.out.println(u.a);
		u.name();
	    u.name1();
		
		

	}

}
