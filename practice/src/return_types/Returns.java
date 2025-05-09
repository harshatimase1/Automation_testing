package return_types;

public class Returns {

	//1)Without return type and no parameters
	
	public void name() {
		System.out.println("Automation");
		
	}
	//2. Without return type and with parameter
	
	public static void abc(String login) {
		System.out.println(login);
		
	}
	//3. With return statement and parameters
	
	public void xyz(int a) {
		System.out.println(a);
		return;
		
	}
	//4. With return type and having parameters
	public int addition(int a,int b) {
		return a+b;
	}
	
	public static String login( String pass) {
		return "Stp_Infotech";
	}
	
	public static int  DDE(int g) {
		return g;
		
	}
	public static void main(String[] args) {
		Returns r=new Returns();
		r.name();
		abc("Testing");
		r.xyz(56);
		System.out.println(r.addition(30,40));
		System.out.println(login("password"));
		System.out.println("The DDE method is returning value of g is : "+DDE(90));
	}

}
