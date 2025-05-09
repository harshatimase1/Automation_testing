package interface_001;

public interface A {
	//we can declare more than non-access modifier and one access modifier 
	//public static final int a=35;
	String s="Manual";
	static float f=34.5f;
	
	public void name1();
	//we can declare static method in interface but can not access in normal class
	public static void name() {
		//System.out.println(a);
		System.out.println(s);
		System.out.println(f);
		System.out.println("Enter name ");
	}
	public abstract void name3();
	
	
	
}
