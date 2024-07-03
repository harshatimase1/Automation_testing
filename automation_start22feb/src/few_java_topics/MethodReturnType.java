package few_java_topics;

public class MethodReturnType {

	// If method is returning something then we must give return statement
	// If method is returning nothing then we must use void, returns in the form of
	// number, String and value
	// Four forms of return statement
	// 1)WITHOUT RETURN TYPE and NO PARAMETERS

	public void abc() {

		System.out.println("Automation");
	}

//2)Without return type and with parameter

	public static void xyz(String testing) {
		System.out.println("Testing");
	}

	// 3) With return statement and with parameters

	public void zxc(int ab) {

		System.out.println(ab);
		return;

	}

	// 4)With return type and having parameters
	public int addition(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		MethodReturnType n=new MethodReturnType();
		
		n.abc();
		xyz("Automation Testing");
		n.zxc(700);
		n.addition(600,900);
		
		//Need to ask questions why output is not print for addition method (with return type and having parameters)
		
	}
		}

