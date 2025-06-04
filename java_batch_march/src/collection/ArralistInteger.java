package collection;

import java.util.ArrayList;

public class ArralistInteger {

	private static final Float Null = null;

	public static void main(String[] args) {

		ArrayList<Float> marks = new ArrayList<Float>();

		marks.add(30.4f);
		
		marks.add(20.4f);
		marks.add(20.4f);

		marks.add(40.4f);
		marks.add(50.4f);
		marks.add(60.4f);
		marks.add(Null);

		System.out.println(marks);

		System.out.println(marks.clone());
		System.out.println(marks.contains(40.4f));
		System.out.println(marks.isEmpty());

		marks.remove(marks.remove(0));
		marks.remove(2);
		System.out.println(marks);
		System.out.println(marks);
		System.out.println(marks.remove(60.4f));
		System.out.println(marks);

	}

}
