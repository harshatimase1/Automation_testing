package thisKey01;

public class Test2 extends Test1 {

	String g = "Non -functional";

	public void name1() {
		System.out.println("This is instance method from child class");

	}

	public Test2() {
		this.name1();
		System.out.println(this.g);
		this.name();
		this.name1();
		System.out.println(this.a);
		System.out.println("User defined constructor of child class");

	}

	public static void main(String[] args) {

		Test2 v = new Test2();

		/*
		 * System.out.println(v.a); v.name(); System.out.println(v.g); v.name1();
		 */

	}

}
