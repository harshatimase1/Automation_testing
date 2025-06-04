package default_values;

import java.lang.reflect.Array;

public class Defaultvalues_datatypes {

	//Integer
	
	byte a;
	short b;
	int c;
	long d;
	
	//floating
	float e;
	double f;
	
	//non-numeric
	char g;
	boolean h;
	
	//non-primitive
	String j;
	Array [][]l;
	
	
	
	public static void main(String[] args) {
		
		Defaultvalues_datatypes t=new Defaultvalues_datatypes();
		
		System.out.println("-----The default values of Integer datatypes are : ------");
		System.out.println("The default value of byte is :"+t.a);
		
		System.out.println("The default value of short is :"+t.b);
		System.out.println("The default value of int is :"+t.c);

		System.out.println("The default value of long is :"+t.d);
		

		
		System.out.println("----Default values of floating datatypes are --------");
		System.out.println("The default value of float is :"+t.e);
		System.out.println("The default value of double is :"+t.f);
		
		
		System.out.println("----Default values of Non-numeric datatypes are --------");

		System.out.println("The default value of char is :"+t.g);
		System.out.println("The default value of boolean is :"+t.h);
		
		System.out.println("The default value of String is :"+t.j);
		System.out.println("The default value of array :"+t.l);




	}

}
