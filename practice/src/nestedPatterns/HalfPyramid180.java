package nestedPatterns;

public class HalfPyramid180 {

	public static void main(String[] args) {
//row 4--col--4
		
		for(int a=1;a<=4;a++) {
			//to print space
			
			for(int b=1;b<=4-a;b++) {
				System.out.print(" ");
			}
			//to print star
			for(int c=1;c<=a;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
