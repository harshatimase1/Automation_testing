package string_001;

public class String_New001 {

	public static void main(String[] args) {
		//using new keyword--heap area --with reference to the variable
		
		
		String d=new String("Functional");
		
		String e=new String("Functional");
		
		String e1=new String("Non-Functional");
		
		//Storage in heap area---
		
		System.out.println("--------------------Heap area Storage--------------------------------");
		
		System.out.println("Storage of d in heap area will be like :"+d);
		
		System.out.println("Storage of e in heap area will be like :"+e);
		
		System.out.println("Storage of e1 in heap area will be like :"+e1);

		//SCP--d=e="Functional"----
		System.out.println("--------------------SCP area Storage--------------------------------");

		
		System.out.println("Storage of d and e in SCP area will be like :"+(d=e));
		
		System.out.println("Storage of e1 in SCP area will be like :"+e1);

		
		

	}

}
