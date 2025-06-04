package thisKeyword;

public class Class01 {
	
	int a=15;
	float b=56.7f;
	static  String s="Automation";
	
	public void name() {
		
		System.out.println(this.a);
		System.out.println("Instance Method");
		
	}

	

	
	public static void main(String[] args) {

		Class01 c=new Class01();
		

	}

}
