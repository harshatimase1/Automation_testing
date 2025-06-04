package variables_001;

public class Static_Variable {
	
//Staic variable: Inside the class but outside method
	 static int a=90;
	
	public void student() {
	  System.out.println(a);
		
	}
	
	public static void std() {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Static_Variable s=new Static_Variable();
		s.student();
		std();
		Static_Variable.std();

	}

}
