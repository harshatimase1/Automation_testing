package hierarchicalInheritance;

public class Performance extends Functional{
	
	String p="Load Testing";
	public static void secModule() {
		System.out.println("Enter load testing details");
		
	}

	public static void main(String[] args) {
		Performance p1=new Performance();
		System.out.println(p1.s);
		p1.test2();
		secModule();
		System.out.println(p1.p);
		
		

	}

}
