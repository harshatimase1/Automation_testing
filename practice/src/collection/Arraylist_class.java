package collection;

import java.util.ArrayList;

public class Arraylist_class {

	public static void main(String[] args) {
		ArrayList<Integer> roll_no=new ArrayList<Integer>();
		roll_no.add(1);
		roll_no.add(0);
		roll_no.add(2);
		roll_no.add(13);
		roll_no.add(4);
		roll_no.add(5);
		roll_no.add(null);
		roll_no.remove(5);
		
		System.out.println(roll_no);
		roll_no.add(2, 100);
		System.out.println(roll_no);
		
		System.out.println(roll_no.contains(2));
		System.out.println(roll_no.clone());
		System.out.println(roll_no.remove(2));
		roll_no.remove(null);
		System.out.println(roll_no);
		
		
		
		

	}

}
