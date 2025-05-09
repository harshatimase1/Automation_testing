package constructor;

public class MultipleParameters {

	public MultipleParameters(int a) {
		this(50, 60);
		System.out.println("Constructor 1");
	}

	public MultipleParameters(int b, int c) {
		this(10, 15.5f, "Stp Infotech");
		System.out.println("Constructor 2");

	}

	public MultipleParameters(int a, float b, String g) {
		this();
		System.out.println("Constructor 3");

	}

	public MultipleParameters(char d) {
		this(45);
		System.out.println("It is a parameterized constructor");

	}

	public MultipleParameters() {
		System.out.println("It is a user defined constructor");
	}

	public static void main(String[] args) {
		MultipleParameters m = new MultipleParameters('S');

	}

}
