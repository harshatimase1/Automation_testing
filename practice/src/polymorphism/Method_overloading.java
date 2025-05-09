package polymorphism;

public class Method_overloading {

	public void book() {
		System.out.println("book method without parameter");

	}

	public void book(int a) {
		System.out.println("book method with int parameter");

	}

	public void book(String a) {
		System.out.println("book method with String parameter");
	}

	public void book(int a, int b, String c, float d) {
		System.out.println("book method with multiple parameter");

	}

	public static void main(String[] args) {
		Method_overloading c = new Method_overloading();
		c.book();
		c.book(50);
		c.book("Automation");
		c.book(4, 6, "Rich", 5.09f);

	}

}
