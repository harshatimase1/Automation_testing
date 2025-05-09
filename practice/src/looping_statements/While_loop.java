
package looping_statements;

public class While_loop {

	public static void main(String[] args) {

		// Example:Print 1 to 10 numbers

		// initialize variable

		System.out.println("-----------------------------Print 1 to 10----------------------------------");
		int a = 1;

		while (a <= 10) {
			System.out.println(a);
			a++;

		}

		// Print hello 10 times

		System.out.println("-----------------------------Print Hello----------------------------------");
		int b = 1;
		while (b <= 10) {
			System.out.println("Hello");
			b++;
		}

		System.out.println("---------Print Even number 1 to 10--------------");
   //Approach 1
		int c = 2;
		while (c <= 10) {

			System.out.println(c);
			c += 2;//c=c+2;
		}
		
		//Approach 2
		System.out.println("---------Print Even number 1 to 10--------------");
		
		int d=1;
		while(d<=10) {
			if(d%2==0) {
				System.out.println(d);
			}
			d++;	
		}
		System.out.println("---------Print Odd number 10 to 20--------------");

		//Approach 2
		
		int t=10;
		while(t<21) {
			if(t%2!=0) {
			System.out.println(t);
		}t++;
		}
		
		//Approach 3
		System.out.println("---------Print Even number 1 to 10--------------");

		int h=1;
		while(h<=10) {
			System.out.print(2*h+" ");
			
			h++;
		}
		System.out.println(" ");
		
		//Print odd number 
		//Approach 3
		System.out.println("---------Print ODD number 1 to 10--------------");

		int j=0;
		while(j<=10) {
			System.out.println((j*2+1)+" ");
			j++;
		}
		
		System.out.println("------Print Even and ODD number like wise--------");

		
		//Example 4: 1.........10
		//1 odd
		//2 even
		//3 odd....print number like wise
		
		int e=1;
		while(e<=10) {
			if(e%2==0) {
				System.out.println(e+" Even Number");
				
			}else {
				System.out.println(e+" Odd Number");
			}
			e++;
			
		}
		
		System.out.println("--------------Print from 10 to 1---------------");
		
		//Example 5: Print from 10.........1(Descending order)
		
		int f=10;
		while(f>0) {
			System.out.println(f);
			f--;
		}

	}

}
