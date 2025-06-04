package jumpingStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		// 1to 10
		
		for(int a=1;a<=10;a++) {
			if(a==5) {
				continue;
			}
			
			System.out.print(a+" ");
			
		}
		
		
		System.out.println();
		System.out.println("-----Using while-----");
		
		//11 to 5
		
		int b=11;
		while(b>=6) {
			b--; 
			if(b==7) {
				continue;
			}
		
			System.out.print(b+" ");
			
			
		
		}
		System.out.println();
		System.out.println("-----Using while-----");
		
		//11 to 1
		int c=11;
		do {
			c--; 
			if(c==7) {
				continue;
			}
		
			System.out.print(c+" ");
			
		}while(c>=2);

	}

}
