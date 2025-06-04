package superKeyWord;

public class Test02 extends Test01 {

	String a = "Testing";

	public void login() {
		System.out.println("Login method from child class");

	}

	public void password() {
		System.out.println("Enter password");

	}

	public void name3() {

		// Here this keyword will access the value of instance variable from child class
		System.out.println(super.a);
		System.out.println(this.a);
		this.username();
		super.login();
		// System.out.println(super.a);
		System.out.println("This is user defined constructor");
	}

	public Test02() {
		super(60, 56.5f);
		
		System.out.println("This is parameterized constructor from child class");
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		t.name3();

	}

}
