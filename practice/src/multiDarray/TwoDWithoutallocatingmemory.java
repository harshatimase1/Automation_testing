package multiDarray;

public class TwoDWithoutallocatingmemory {

	public static void main(String[] args) {

		int[][] list= {{2,4,8,9},{6,7,0,5},{9,3,4,8}} ;
		
		//nested loop--row 2---0to 1--col 2--0 to 1
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------------------------");
		System.out.println("The value at index 1 and 2 is as :"+list[1][2]);
	}

}
