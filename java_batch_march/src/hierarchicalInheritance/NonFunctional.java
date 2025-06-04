package hierarchicalInheritance;

public class NonFunctional extends Functional {

	double d = 89.9;

	public void data() {
		System.out.println("Enter data");

	}

	public static void main(String[] args) {
		NonFunctional n=new NonFunctional();
		System.out.println(n.s);
		n.test2();
		System.out.println(n.d);
		n.data();
		

	}

}
