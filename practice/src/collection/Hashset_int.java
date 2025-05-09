package collection;

import java.util.HashSet;

public class Hashset_int {

	public static void main(String[] args) {
		HashSet<Integer> abc=new HashSet<Integer>();
		//using for loop
		
		for(int a=1; a<=100; a++) {
			abc.add(a);
		}
		
		//To print all the values from 1 to 100
		System.out.println(abc);
		System.out.println(abc.clone());
		System.out.println(abc.isEmpty());
		 System.out.println(abc.size());

	}

}
