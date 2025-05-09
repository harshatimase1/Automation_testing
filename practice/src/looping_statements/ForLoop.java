package looping_statements;

public class ForLoop {

	public static void main(String[] args) {

		//syntax for loop
		//Example 1:  print 1 to 10
		for(int a=1;a<=10;a++) {
			System.out.println(a);
		}
		
		//2)print even number---increment by 2 --b=b+2 or b+=2
		
		System.out.println("-------------------Even Number-------------");
		for(int b=2;b<=10;b+=2) {
			System.out.println(b);
		
		}
		System.out.println("-------------------Even or Odd  Number-------------");
        //3)Example: 1odd,2even ...print like wise
		
		for(int c=1;c<=10;c++) {
			if(c%2==0) {
				System.out.println(c+" Even");
			}
			else {
				System.out.println(c+" Odd");
			}
		}

		//Example 4 --Print 10 to 1--
		System.out.println("------------------10 to 1-------------");

		for(int d=10;d>=1;d--) {
			System.out.println(d);
		}
	 
		System.out.println("---------Table 4 print---------");
		
		for(int e=1;e<=10;e++) {
			System.out.println(4*e);
		}
		System.out.println("---------Even Number---------");

		//even number 
		for(int e=1;e<=100;e++) {
			System.out.println(2*e);
		}
		
		System.out.println("---------Print table in 4*1 format---------");
		//4*1=4;
		//4*2=8;
		
		for(int f=1;f<=10;f++) {
			System.out.println("4*"+f+"="+(4*f));
		}

	}

}
