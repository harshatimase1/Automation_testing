package loopingStatements;

public class For_loop {

	public static void main(String[] args) {
		//print 1 to 10
		
		for(int a=1;a<=10;a++) {
			System.out.println(a);
		}
		//print 10 to 1
		System.out.println("-------------------------Print 10 to 1------");
		for(int b=10;b>0;b--) {
			System.out.println(b);
		}
		System.out.println("-------------------------------");

		
		//Even number 1 to 100 
		
		for(int c=1;c<=100;c++) {
			if(c%2==0) {
				System.out.println(c);
			}
		//odd number another way using d=d+2 or d+=2
	
			System.out.println("----------Odd number another way 1 to 100-----------");

			for(int d=1;d<=100;d+=2) {
				System.out.println(d);
			}
				
			//print table--5 to 50 table//5 10 15 20 25
			
			System.out.println("-------Print table-----");
			
			for(int e=1;e<=10;e++) {
				System.out.println(e*5);
			}
			
			
			//Print table in this formate  5*1=5; 5*2=10
			
			System.out.println("-------Print table format 5*1=5-----");
			
			for(int f=1;f<=10;f++) {
				
				System.out.println("5*"+f+"="+(5*f));
			}
//Print this 1 to 25 below format
			//1 Odd number
			//2 Even Number
			//3 Odd Number
		
		}
	
	}

}
