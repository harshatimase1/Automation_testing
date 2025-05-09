package this_keyword;

public class Define extends Name {
	int a = 13;
	static byte h = 79;
	String k="Manual";
	
	public void search() {
		System.out.println(this.a);
		System.out.println(this.h);
		System.out.println(this.p);
		System.out.println(this.k);
		System.out.println("Search functionality");
		
	}
	
	public void function() {
		this.search();
		System.out.println(this.p);
		this.abc();
		System.out.println("Chech the functionality");

	}

	public static void main(String[] args) { 
		Define k_01=new Define();
		k_01.function();
		//default constructor of parent class gets automatically called in child class constructor

	}

}
