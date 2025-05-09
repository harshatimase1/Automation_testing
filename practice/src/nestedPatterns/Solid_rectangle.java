package nestedPatterns;

public class Solid_rectangle {

	public static void main(String[] args) {
		
		//Solid rectangle--4 row -outer loop-5 column --inner loop
		
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=5;c++) {
				System.out.print(" * ");
				
			}
			//System.out.println("\n");
			System.out.println();
		}
		System.out.println("------------Print Numbers in solid rectangle------------");
		
		for(int r1=1;r1<=5;r1++) {
			for(int c1 = 1;c1<=4;c1++) {
				//System.out.print(r1+" ");
				System.out.print(c1+" ");
			}
			System.out.println();
		}
		System.out.println("------------Print Numbers in solid rectangle------------");

		for(int a=1;a<=4;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print(a+""+b+" ");
			}
			//System.out.println("\n");
			System.out.println();
		}
		
		
		}

	}


