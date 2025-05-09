package collection;

import java.util.HashSet;

public class Hashset_class {

	public static void main(String[] args) {
		
		HashSet<Float> f=new HashSet<Float>();
		f.add(45.5f);
		f.add(45.5f);
		f.add(45.5f);
		f.add(30.5f);
		f.add(30.5f);
		f.add(30.5f);
		f.add(null);
		f.add(null);
		
		System.out.println(f);
		System.out.println(f.clone());
		
		System.out.println(f);

	}

}
