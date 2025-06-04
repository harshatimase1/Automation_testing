package nestedLoops;

public class Zero_One {

	public static void main(String[] args) {
		//row -1 to 5
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				//int c = a+b;
				if((a+b)%2==0) {
					System.out.print("1 ");
					
				}else {
					System.out.print("0 ");
					
				}
		
			}
			System.out.println();
			
		}

	}

}
