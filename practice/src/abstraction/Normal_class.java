package abstraction;

public class Normal_class extends Abstract_001 {

	public void match() {
		System.out.println("Match");
		
	}
	
	public static void main(String[] args) {
		Normal_class n=new Normal_class();
		unit();
		n.abc();
		n.std();
		n.login();
		n.find();
		n.give();
		n.match();
		
	}

	@Override
	public void std() {
		System.out.println("Standard output");
	}

	@Override
	public void abc() {
		System.out.println("Enter the value of abc");
	}

	@Override
	public void login() {
		System.out.println("Login functionality");
	}

	@Override
	public void find() {
		System.out.println("Find out output");
	}

}
