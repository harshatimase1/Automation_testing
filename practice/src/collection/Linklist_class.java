package collection;

import java.util.LinkedList;

public class Linklist_class {

	public static void main(String[] args) {

		LinkedList<Character> c=new LinkedList<Character>();
		c.add('A');
		c.add('B');
		c.add('C');
		
		System.out.println(c);
		System.out.println(c.peek());
		System.out.println(c.poll());
		System.out.println(c);
		
		System.out.println(c);
		System.out.println(c.pollFirst());
		System.out.println(c.pollLast());
		System.out.println(c);
		System.out.println(c.reversed());
	}

}
