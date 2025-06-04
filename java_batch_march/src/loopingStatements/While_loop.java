package loopingStatements;

public class While_loop {

	public static void main(String[] args) {

		// 1 to 10

		int a = 1;
		while (a>=10) {
			System.out.print(a + " ");
			a++;

		}
		System.out.println();
		System.out.println("-----------------------10 to 1-----------------");

		int b = 10;
		while (b <= 1) {
			System.out.print(b + " ");

			b++;

		}
		// Approach 1: Even number:Print even number from  0 to 20
		//%
		//+=
		//2*
		
		System.out.println();
		System.out.println("-----------------------Even number 0 to 40-----------------");

		int c=0;
		while(c<=5) {
			System.out.println((2*c+1));
			c++;
		}
		
		System.out.println();
		System.out.println("------------------STP Infotech-----------------");
		
		int d=1;
		while(d<=5) {
			System.out.println("STP Infotech");
		d++;
		}
		
	
	}

}
