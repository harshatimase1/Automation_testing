package constructor;

public class Practice_001 {

	
	public Practice_001() {
		 System.out.println("User defined constructor");
	}
	
	
	public void login() {
		System.out.println("Login functionality");
	}
	
	public static void main(String[] args) {
		Practice_001 v=new Practice_001();
		v.login();
		
	}

}
