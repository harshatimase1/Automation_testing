package multilevelInheritance;

public class C extends B {

	public static void username() {
		System.out.println("Enter username");

	}

	public static void main(String[] args) {
		C j = new C();
		j.login();
		System.out.println(j.a);
		username();

	}

}
