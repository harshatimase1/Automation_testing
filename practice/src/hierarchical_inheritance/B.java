package hierarchical_inheritance;

public class B extends A{
	
	int a=15;
	public static void username() {
		System.out.println("Enter username");
		
	}

	public static void main(String[] args) {
		
		B b=new B();
		
		b.login();
		username();
		System.out.println(b.a);

	}

}
