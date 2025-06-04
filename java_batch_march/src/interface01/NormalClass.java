package interface01;

public class NormalClass implements Usename_Interface,Sign_in_Interface {

	public static void main(String[] args) {
		
		NormalClass n=new NormalClass();
		
		n.name();
		n.name2();
		System.out.println(n.a);
		System.out.println(n.f);
		System.out.println(n.q);
		n.pass();

		//we can not access static method from interface in normal class
		
		
		//classname.methodname()
		
		Usename_Interface.name3();
		
		
	}

	@Override
	public void name() {
		System.out.println("This is the name method from Usename interface");
		
	}

	@Override
	public void name2() {
		System.out.println("This is the name2 method from Usename interface");
		
	}

	@Override
	public void pass() {
		System.out.println("Pass method from sign_in interface");
		
	}

}
