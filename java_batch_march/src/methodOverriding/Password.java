package methodOverriding;

public class Password extends Username {

	// public>protected>default>private
	public void functinal() {
		System.out.println("functional method from child class");

	}

	public void QDE() {

		System.out.println("QDE method from child class");
	}

	public static void name() {
		System.out.println("Static method from child class");

	}

	public static void main(String[] args) {
		// is a relationship --create object of child class
		Password p = new Password();

		// p.functinal();
		p.functinal();
		p.QDE();
		p.name();

//		p.QDE();
//		name();
//		System.out.println();

		// As per the 3rd property of inheritance-has a relationship parent class ref
		// var can reffer or hold the child class object

		Username u = new Password();
		u.functinal();
		u.QDE();
		u.name();

//		u.functinal();
//		u.QDE();
//		name();

		System.out.println();
		// has a relationship--create object of parent class

		Username p1 = new Username();
		p1.functinal();
		p1.QDE();
		p1.name();

//	p1.functinal();
//	p1.QDE();
//	p1.name();
//		

	}

}
