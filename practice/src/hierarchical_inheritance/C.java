package hierarchical_inheritance;

public class C extends A {
	float f = 67.8f;

	public static void name() {
		System.out.println("Enter name of students");

	}

	public static void main(String[] args) {

		C p=new C();
		p.login();
		name();
		System.out.println(p.f);
	}

}
