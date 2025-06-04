package abstraction;

public class Username extends Login {

	public static void main(String[] args) {
		Username q=new Username();
		q.address();
		q.bankdetails();
		q.name();
		q.persondetails();
		educationaldetails();
		q.abc();
		

	}

	public void abc() {
		System.out.println("Enter Value");
		
	}
	@Override
	public void name() {
		System.out.println("Enter name");
	}

	@Override
	public void address() {
		System.out.println("Enter address details");

	}

	@Override
	public void bankdetails() {
		System.out.println("Enter bankdetails");

	}

}
