package control_statements;

public class Half_pyramid {

	public static void main(String[] args) {
		 //row 4, col 4
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
