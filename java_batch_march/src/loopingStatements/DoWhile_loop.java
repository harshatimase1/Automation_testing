package loopingStatements;

public class DoWhile_loop {

	public static void main(String[] args) {
		
		//1 to 10
		
		int a=1;
		do {
			System.out.println(a);
			a++;
		}while(a<=10);
		
		//even number 0 to 10
		
		System.out.println("---------------------");
		int b=0;
		do {
			System.out.println(2*b);
			b++;
		}while(b<=5);
		
		
		//Approach 2:even number with % 
		System.out.println("--------0 to 10 Even number-------------");
		
		int c=0;
		do {
			if(c%2==0) {
				System.out.println(c);
			}
			c++;
		
		}while(c<=10);


	}

}
