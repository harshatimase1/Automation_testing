package inheritance;

public class ClassB extends ClassA {

	double d=78.90;
	public static void main(String[] args) {
		ClassB v = new ClassB();

		System.out.println(v.a);
		v.take();
		System.out.println(v.d);

	}

}
