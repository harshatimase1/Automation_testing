package constructor;

public class ParameterizedConstructor {
 public ParameterizedConstructor(int a,float f,String g) {
	 System.out.println("It is a parameterized constructor");
	 System.out.println("Value of a is :"+a);
	 System.out.println("Value of f is :"+f);
	 System.out.println("Value of g is :"+g);
 }
	
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor(45,50.5f,"Stp Infotech");
		

	}

}
