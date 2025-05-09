package abstraction;

public class Normal_class02 extends Abstract_003 {

	public static void main(String[] args) {

		Normal_class02 v=new Normal_class02();
		v.password();
		v.username();
	}

	@Override
	public void username() {
		System.out.println("Enter email");

	}

	
	@Override
	public void password() {
		System.out.println("Password must be 6 digit");
	}

}
