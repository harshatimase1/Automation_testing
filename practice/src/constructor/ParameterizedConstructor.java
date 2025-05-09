package constructor;

public class ParameterizedConstructor {

	public ParameterizedConstructor(int a, float b, String c) {
		System.out.println("It is a parameterized constructor");
		System.out.println("First value is :" + a);
		System.out.println("First value is :" + b);

		System.out.println("First value is :" + c);

	}

	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor(5, 7.6f, "Stp Infotech");
	}

}
