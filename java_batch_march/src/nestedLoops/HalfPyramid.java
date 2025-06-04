
package nestedLoops;

public class HalfPyramid {

	public static void main(String[] args) {
		//outer loop--row -1 to 4
		
		for(int a=1;a<=4;a++) { 
			
			for(int b=1;b<=a;b++) { 
				System.out.print("* ");
			
			}
			System.out.println();
		}
	System.out.println("------------------------Half Pyranid with Number----------");
	for(int a=1;a<=6;a++) { 
		
		for(int b=1;b<=a;b++) { 
			System.out.print(b+" ");
		
		}
		System.out.println();
	}
		
	
	
	}

}
