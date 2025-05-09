package abstraction;

public abstract class Abstract_001 {
	public abstract void std();

	public abstract void abc();

	public abstract void login();

	public abstract void find();

	public void give(){
		System.out.println("Given");
	}
	public static void unit(){
		System.out.println("Unit");
	}

	public static void main(String[] args) {
		//we cannot create the object of abstract class
		//Normal_class n=new Normal_class();
		
	}
}
