package thisKeyword;

public class ThisKeyClassA {

	String s = "Automation";

	public void name() {
		System.out.println("Instance method");

	}

	public ThisKeyClassA() {
		
		System.out.println("User defined constructor");

		System.out.println(this.s);
		this.name();
		//System.out.println("User defined constructor");

	}

	public static void main(String[] args) {
		ThisKeyClassA v = new ThisKeyClassA();

	}

}
