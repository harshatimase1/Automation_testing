package jumping_Statements;

public class ContinueStatement {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {

			if (a == 5 ||a==3||a==4) {
				continue;//it will skip 5,3,4 as continue statements appear it will continue and move to the increment operator and will continue by skipping that number
				
			}

			System.out.println(a);
		}
		System.out.println("---------------Use continue keyword in WhileLoop---------- ");

		int b=0;
		while(b<11) {
			b++;
			if(b==6) {
				continue;
			}
			System.out.print(b+" ");
			
		}
		System.out.println();
		System.out.println("---------------Use continue keyword in DoWhileLoop---------- ");

		int c=0;
		do {
			c++;
			if(c==6) {
				continue;
			}
			System.out.print(c+" "); //1 2 3 4 5 
			
			
		}while(c<=20);
		
		
	}

}
