package string001;

public class String_new {

	public static void main(String[] args) {

		//Using new keyword
		
		
		String c=new String("Automation");
		String d=new String("Automation");
		String e=new String("Manual");
		
		//a)Heap area:
		System.out.println("Storage of c will be  done in heap area is : "+c);
		System.out.println("Storage of d will be done in heap area is : "+d);
		System.out.println("Storage of e will be done in heap area is : "+e);
		
		//b)SCP area
		
		System.out.println("Storage of c and d is done in SCP area as :"+(c=d));
		System.out.println("Storage of e is done in SCP area is : "+e);
		
		
		
	}

}
