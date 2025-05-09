package inheritance;

public class D extends ClassA {

	float f = 57.8f;

	public static void main(String[] args) {

		// 3rd property of inheritance--we can use parent class ref_var to refer or hold
		// child class object
		ClassA r = new D();
		
		System.out.println(r.a);
		r.take();
		
		//4th property -we can not use child class ref_var to refer or hold the parent class properties
      // D j=new ClassA();//not possible
		
		
	}

}
