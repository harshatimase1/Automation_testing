package operators;

public class Logical_operator {

	public static void main(String[] args) {
		int a=7;
		int b=8;
		
		//True ,true --True
		boolean c=a<b&&b>a;
		System.out.println(c);
		System.out.println("The output of c is : "+(a<b&&b>a));
		
		//True, False--false
		boolean d=a<=b&&b==a;
		System.out.println("The output of d is : "+d);
		
		//False , True--False
		
		boolean f=a==b&&a!=b;
		System.out.println("The output of f is : "+f);
		
		//False,false--false
		boolean g=a>b&&b<a;
		
		System.out.println(g);
		
		//logical or ||  true true true
		System.out.println("--------------------------------------");
		
		boolean h=a<b||b>a;
		System.out.println(h);
		
		//True false True
		System.out.println(a<b||b<a);
		
		//False True True
		System.out.println(a>b||b>a);
		
		//False False False
		System.out.println(a>b||b<a);
		System.out.println("------------------------------------------------");
		//Logical not !
		int y=90;
		int i=80;
		//True---False
		System.out.println(!(y>i));
		//False--True
		boolean p=!(i>y);
		System.out.println(p);
	

	}

}
