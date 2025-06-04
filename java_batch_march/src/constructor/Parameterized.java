package constructor;

public class Parameterized {

	public Parameterized(int a) {
		this(16, 17);
		System.out.println("Parameterized defined constructor");

	}

	public Parameterized(int b, int c) {
		this();
		System.out.println("Parameters integer");

	}

	public Parameterized(String f) {
		this(60);
		
		System.out.println("Parameters String");

	}

	public Parameterized(float f) {
		this("Non-functional");
		
		System.out.println("Parameters float");

	}

	public Parameterized() {
		System.out.println("User defined constructor");
	}
	
	public static void main(String[] args) {

		Parameterized p = new Parameterized(34.5f);
		
	}

}
