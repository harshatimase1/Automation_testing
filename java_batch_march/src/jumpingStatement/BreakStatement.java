package jumpingStatement;

public class BreakStatement {

	public static void main(String[] args) {
		//1 to 10 
		//break keyword in for loop
		for(int a=1;a<=10;a++) {
			
			System.out.print(a+" ");
			if(a==5) {
				break;
			}
			
		
		}
		System.out.println();
		System.out.println("--------break keyword in While loop--------");
		
		//10 to 1
		
		int b=10;
		while(b>=1) {
			System.out.print(b+" ");
			if(b==7) {
				break;
			}
			b--;
		}
		
		// print AutomationBatch 5 times
		//1 to 10
		System.out.println();
		System.out.println("--------break keyword in DoWhile loop--------");
		
		
		int c=1;
		do {
			System.out.print(c+" ");
			if(c==7) {
				break;
			}
			c++;
		}while(c<=10);
		
		
		
		System.out.println();
		System.out.println("--------break keyword in DoWhile loop--------");
		
		
		//1 to 10
		
		int d=1;
		do {
			System.out.println("AutomationBatch");
			if(d==5) {
				break;
			}
			d++;
		}while(d<=10);
		
	
	}

}
