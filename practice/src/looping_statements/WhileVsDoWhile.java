package looping_statements;

public class WhileVsDoWhile {

	public static void main(String[] args) {

		
		
		//With While loop  print 1to 5
		System.out.println("------While loop execution-----");
		int a=1;
		while(a<=5) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("-----Do While loop execution-----");
		
		int b=10;
		do {
			System.out.println(b);
			b++;
			
		}while(b<=5);

		
	}

}
