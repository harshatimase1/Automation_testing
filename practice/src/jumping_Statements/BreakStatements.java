package jumping_Statements;

public class BreakStatements {

	public static void main(String[] args) {

		for(int a=1;a<=10;a++) {
			
			System.out.println(a);
			if(a==5) {
				break;
			}
		}
		System.out.println("-------------Break in while loop-------");
		
		int b=1;
		while(b<=10) { 
			System.out.print(b+" ");
			if(b==6) {
				break;
			}
			b++;
		}
		System.out.println();
		System.out.println("-------------Break keyword in Dowhile loop-------");
		int c=10;
		do {
			System.out.println(c);
			if(c==7) {
				break;
			}
			c--;
			
		}while(c>=1);
		
		System.out.println();
		System.out.println("-------------Break keyword in while loop-------");

		int d=10;
		while(d>=1) {
			System.out.println("Hello");
			if(d==5) {
				break;
			}
			d--;
			
		}
		
	}
	
}
