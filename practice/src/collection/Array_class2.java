package collection;

import java.util.ArrayList;

public class Array_class2 {

	public static void main(String[] args) {
		ArrayList<String> name =new ArrayList<String>();
		/* name.add("Sharvi");
		name.add("Sharvi");
		name.add("Harsha");
		name.add("Shubhu");
		name.add("Aai");
		name.add("Baba");
		name.add(null);*/
		//second way
		name.add(0, "Sharvi");
		name.add(1, null);
		name.add(2, "Harsha");
		
		System.out.println(name);
		name.remove(1);
		System.out.println(name);
		name.removeLast();
		System.out.println(name);
		
		
		
		

	}

}
