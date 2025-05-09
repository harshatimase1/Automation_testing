package thisKeyword;

public class ClassB extends ThisKeyClassA {

	int a = 15;
	double d = 67.7;
	float f = 45.5f;
	static String s1 = "Automation";

	public void write() {
		System.out.println("Instance Method");

		System.out.println(this.a);
		System.out.println(this.d);
		System.out.println(this.f);
		System.out.println(this.s1);
		///System.out.println("Instance Method");

	}

	// By default constructor of parent class gets called when we create an object
	// of child class
	public void name1() {
		this.write();
		// this.name();
		
		//System.out.println(this.s);
		System.out.println("Second instance method");

	}

	public static void main(String[] args) {
		ClassB c = new ClassB();
		c.name1();

	}

}
