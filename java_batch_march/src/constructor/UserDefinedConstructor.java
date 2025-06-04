package constructor;

public class UserDefinedConstructor {
	
	public UserDefinedConstructor() {
		System.out.println("It is a user defined constructor");
		
		
	}
	
	public void login() {
		System.out.println("Login functionality");
	}
	
	public static void main(String[] args) {
		
		UserDefinedConstructor c=new UserDefinedConstructor();
		c.login();

		
	}

}
