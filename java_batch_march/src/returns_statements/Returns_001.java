package returns_statements;

public class Returns_001 {
	
	//Without return statement and no parameters
	public void test() {
		System.out.println("Automation");

	}
	//Without return statement and with parameters
	
	public static void name(int a) {
		System.out.println(a);
		
	}
	//With return statement and parameters
	public void test1(String b) {
		System.out.println(b);
		return ;

	}
	//With return type and having parameters
	
	public int add(int a, int b) {
		
		return a+b;
		
	}
	public static float name(int a,long b,float c) {
		return   (a+b+c);
	
	}
	public char institute(char q) {
		return 'S';
		
	}
	public String name(String login) {
		return "STP_Infotech";
	}


	public static void main(String[] args) {
		Returns_001 a=new Returns_001();
		a.test();
		name(15);
		a.test1("Manual");
		System.out.println(a.add(10, 200));
		System.out.println(name(10, 20, 30.5f));
		System.out.println(a.institute('T'));
		System.out.println(a.name("password"));
	
	
	}

}
