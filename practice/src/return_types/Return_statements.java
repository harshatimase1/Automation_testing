package return_types;

public class Return_statements {
	//Without return type and no parameter
	public void name() {
		System.out.println("Automation");
		
	}
	//Without return type and with parameter
	
	public static void name1(String Testing) {
		System.out.println(Testing);
		
	}
	
	//With return statement and parameters
	
	public void name3(int a) {
		
		return;
		
	}

	//With return type and having parameters
	public int name4(int a,int b) {
		return a+b;
		
		
	}
	
	public static String abc(String k) {
		return k;
		
	}
	public static String functionality(String i) {
		return "STP_Infotech";
		
	}
	public static void main(String[] args) {
		Return_statements a=new Return_statements();
		a.name();
		name1("Manual");
		a.name3(12);
		System.out.println(a.name4(12, 30));
		System.out.println(abc("Hello"));
		System.out.println(functionality("Password"));

	}

}
