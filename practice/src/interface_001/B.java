package interface_001;

public class B implements A{

	public static void main(String[] args) {
		B b=new B();
		b.name1();
		b.name3();
		//to access static method from interface class we need to use syntax as --classname.methodname
		A.name();
		 
		//as per 3rd property of inheritance parent class ref_variable can hold or refer to child class object
		/*A w=new B();
		w.name1();
		w.name3();
	    A.name();
*/
	}

	@Override
	public void name1() {
		System.out.println("Enter 1st name");
		
	}

	@Override
	public void name3() {
		System.out.println("Enter 3rd name");		
	}

}
