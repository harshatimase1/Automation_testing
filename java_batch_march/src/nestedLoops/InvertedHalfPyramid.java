package nestedLoops;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		//outer loop--row -4 to 1
		
		for(int a=4;a>=1;a--) {
			
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	
	}

}
