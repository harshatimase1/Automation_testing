package methodOverLoading;

public class HealthcareDomain {

	public void test1(int c, float f) {
		System.out.println("Enter multiple parameters ");

	}

	public void test1(int a) {
		System.out.println("Enter integer parameters ");

	}

	public void test1(double b) {
		System.out.println("Enter double parameters ");

	}

	public void test1(String g) {
		System.out.println("Enter String parameters ");

	}

	public void test1() {

		System.out.println("No parameters ");
	}

	public static void test1(float f) {
		
		System.out.println("Static method");

	}

	public static void main(String[] args) {
		HealthcareDomain v = new HealthcareDomain();
		v.test1();
		v.test1(67.8);
		v.test1(45);
		v.test1("Heathcare Project");
		v.test1(25, 56.7f);
		test1(45.6f);
		

	}

}
