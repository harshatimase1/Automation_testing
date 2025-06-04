package nestedLoops;

public class FloydsTriangle {

	public static void main(String[] args) {
		//row -1 to 5
		
		int c=1;
		for(int a=1;a<=5;a++) { 
			for(int b=1;b<=a;b++) {  
				System.out.print(c+" ");
				c++;//2 3 4 5 6 7 
			}
			System.out.println();
		}
	
	}

}
