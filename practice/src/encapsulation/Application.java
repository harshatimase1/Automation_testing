package encapsulation;

public class Application {

	private String password="Stp123";
	private void login(String a) {
		password=a;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		Application app=new Application();
		app.login("xyz123");
	}

}
