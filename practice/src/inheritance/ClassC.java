package inheritance;

public class ClassC {

	float f = 23.4f;

	public static void main(String[] args) {
//has a relationship --create object of parent class --we can not access the data properties and behaviour of child class
		ClassA c = new ClassA();

		System.out.println(c.a);
		c.take();
		
		
		
	

	}

}
