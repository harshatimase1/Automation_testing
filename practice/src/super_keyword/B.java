package super_keyword;

public class B extends A {
	String a = "Performance Testing";
	int d = 90;
	double f = 100;

	public void test() {

		System.out.println(this.d);
		System.out.println(this.f);
		System.out.println(this.a);
		System.out.println(super.a);
		super.test();
		// method name option is different in parent class hence we can access it with
		// the help of this keyword also
		this.option();

		System.out.println("Perform Testing");

	}

	public B() {
		super(90, 45.5f);

		System.out.println("Called parameterized constructor from parent class");
	}

	public static void main(String[] args) {
		B b = new B();

		b.test();

	}

}
