package method_overriding;

public class Child_class extends Parent_class {

	public void standard() {
		System.out.println("standard method from child class");
	}
	public void beach(String l) {
		System.out.println("Beach method from child class");
		
	}
	public static void main(String[] args) {
		
		//child class object
		
		Child_class s=new Child_class();
		s.standard();
		s.beach("Goa");
		
		//As per 3rd property of inheritance we can use parent class ref_var to hold the child class properties
		Parent_class p=new Child_class();
		p.standard();
		p.beach("Aligad");
		
		//Has a relationship: We create object of parent class
		
		Parent_class p1=new Parent_class();
		p1.standard();
		p1.beach("Agaghan Palace");
	}

}
