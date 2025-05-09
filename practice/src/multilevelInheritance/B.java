package multilevelInheritance;

public class B extends A {
	int a = 15;

	public static void main(String[] args) {
		B b=new B();
		b.login();
		System.out.println(b.a);

	}

}
