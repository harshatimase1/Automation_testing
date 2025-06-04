package method_argument;

public class Method_parameter001 {

	int a;
	int w;
	long p;
	String t;
	static double x ;
	static float r;

	public void abc(boolean q, char z) {
		boolean j = q;
		char h = z;

		System.out.println(j);
		System.out.println(h);
		System.out.println(t);
	}

	public void test(int b, int c, long l) {
		a = b;
		w = c;
		p = l;
		System.out.println(a);
		System.out.println(w);
		System.out.println(p);

	}

	public static void unit(float f, double s) {
		x = s;
		System.out.println(x);
		r = f;
		System.out.println(r);

	}

	public static void main(String[] args) {

		Method_parameter001 k = new Method_parameter001();
		// k.test(45,50,90);
		unit(45.5f, 90);
		// k.abc(true,'S',"Automation");

	}

}
