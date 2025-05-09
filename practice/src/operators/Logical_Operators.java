package operators;

public class Logical_Operators {

	public static void main(String[] args) {
   //logical and &&
		
		int a=45;
		int b=35;
		int g=80;
		
		boolean h=g>a && b<a;
		System.out.println(h);
		System.out.println(a>b && b!=a);
		
		//logical or ||
		boolean h1=g<a||b>a;
		
		System.out.println(h1);
		
		//logical not !
		
		System.out.println(!(h));
		System.out.println(!(h1));
		System.out.println(!(g<a||b>a));
		

	}

}
