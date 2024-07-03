package few_java_topics;

public class Parameteres {

	// Parameters or method arguments is a variable that is used to assign or define
	// particular value to a variable during method creation
	// we can use primitive and non primitive data type as method parameter

	int a;
	float b;
	static int c;
	static String x;

	public void data(float y) {
		b = y;
		System.out.println("The value of b is:" + b);

	}

	public void std(int m, int r) {

		a = m;
		c = r;
		System.out.println("The value of a is :" + a);
		System.out.println("The value of c is :" + c);
	}

	public static void verify(boolean q, boolean u, String p) {
		boolean h = q;
		boolean i = u;
		String x = p;
		System.out.println(h);
		System.out.println(i);
		System.out.println("The value of X is: " + x);

	}
	// Method signature: name of method (parameter type)
	// From above method signatures are : data(float), std(int), verify(boolean,
	// boolean,String)

	public static void main(String[] args) {
		Parameteres ab = new Parameteres();

		ab.data(67.5f);
		ab.std(80, 500);

		verify(false, true, " Login");

	}
}
