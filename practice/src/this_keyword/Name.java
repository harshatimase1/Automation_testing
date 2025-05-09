package this_keyword;

public class Name {
	int p = 12;
	

	public void abc() {
		System.out.println("User define Instance method");
		
	}
	//constructor
	public Name() {
		System.out.println(this.p);
		this.abc();
		System.out.println("User defined constructor");
	}
	public static void main(String[] args) {
		Name v=new Name();
	}

}
