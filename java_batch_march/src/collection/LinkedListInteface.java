package collection;

import java.util.LinkedList;

public class LinkedListInteface {

	public static void main(String[] args) {
		
		LinkedList< String> Domain=new LinkedList< String> ();
		
	
		Domain.add(0, "HealthCare");
	
		Domain.add(1, "Banking");
		Domain.add(2, "Ecommerce");
		Domain.add(3, "ERP");
		Domain.add(4, "Property Management");
		Domain.add(5, "LOS");
		Domain.add(6, "LMS");
		Domain.add(7, "Telecom");
		Domain.add(8, "Telecom");
		Domain.add(9, null);
		//Domain.add(9, "Telecom");
		System.out.println(Domain);
		
		System.out.println(Domain.clone());
		System.out.println(Domain.getFirst());
		System.out.println(Domain.getLast());
		
		Domain.remove(3);
		
		System.out.println(Domain);
		
	
	}

}
