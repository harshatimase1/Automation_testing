package few_java_topics;

public class Default_value {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String i;

	public static void main(String[] args) {
		
        Default_value x = new Default_value();
        
        //To access instance variables in static method need reference variable

		System.out.println("Default value of byte is : " + x.a);
		System.out.println("Default value of short is : " + x.b);
		System.out.println("Default value of int is : " + x.c);
		System.out.println("Default value of long is : " + x.d);
		System.out.println("Default value of float is : " + x.e);
		System.out.println("Default value of double is : " + x.f);
		System.out.println("Default value of char is : " + x.g);
		System.out.println("Default value of boolean is : " + x.h);
		System.out.println("Default value of string is : " + x.i);

	}

}

/*Notes:Default Values
Default value of byte is : 0
Default value of short is : 0
Default value of int is : 0
Default value of long is : 0
Default value of float is : 0.0
Default value of double is : 0.0
Default value of char is :    
Default value of boolean is : false
Default value of string is : null    
*/





