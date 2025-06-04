package variables_001;

public class Local_Variable {

	// Inside the class and method
	public void QDE() {
		int a = 90;
		System.out.println(a);

	}

	public static void DDE() {
		byte b = 100;
		System.out.println(b);

	}

	public static void main(String[] args) {
		
		Local_Variable v=new Local_Variable();
		v.QDE();
		DDE();		
		Local_Variable.DDE();
	}

}
