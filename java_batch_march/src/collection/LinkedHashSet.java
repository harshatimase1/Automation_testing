package collection;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {

		java.util.LinkedHashSet<Integer> emp_id = new java.util.LinkedHashSet<Integer>();

		// for loop 1 to 100
		emp_id.add(3000);
		emp_id.add(200);
		emp_id.add(null);
		emp_id.add(50);
		emp_id.add(10);
		emp_id.add(30);
		emp_id.add(40);
		emp_id.add(50);
		emp_id.add(100);
		emp_id.add(60);
		emp_id.add(70);
		emp_id.add(null);

//		for (int i = 1; i <= 100; i++) {
//			emp_id.add(i);
//
//		}
//		System.out.println(emp_id);

		// iterator
		// has next method we need to use here in while loop
		// next method used
		Iterator<Integer> i = emp_id.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}

}
