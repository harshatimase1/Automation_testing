package abstraction;

public class NormalClass extends A {

	public static void main(String[] args) {
		NormalClass n=new NormalClass();
		n.verify();
	
		
		/*n.add();
		n.verify();
		n.sub();*/

	}

	@Override
	public void verify() {
		this.add();
		this.sub();
		System.out.println("Verify ");
	}

	@Override
	public void add() {
		System.out.println("Addition");
	}

	@Override
	public void sub() {
		System.out.println("substraction");
	}

}
