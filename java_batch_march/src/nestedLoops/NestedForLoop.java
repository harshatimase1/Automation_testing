package nestedLoops;

public class NestedForLoop {

	public static void main(String[] args) {
		//print value 1 to 5 outer loop ---inner loop 1 to 3
		
	//outer loop -1 to 5 --
		
		for(int a=1;a<=5;a++) {
			System.out.println("The value of outer loop  is : "+a);
			for(int b=1;b<=3;b++) {
				System.out.println(b);
			}
		
		}
	
	}

}
