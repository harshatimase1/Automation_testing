
package multiDarray;

public class TwoDarrayInteger {

	public static void main(String[] args) {
		
		int[][]roll_no=new int[2][3];//row 3--index--0to1 and col-3--index0 to 2
		
		roll_no[0][0]=2;
		roll_no[0][1]=4;
		roll_no[0][2]=6;
		
		roll_no[1][0]=7;
		roll_no[1][1]=8;
		roll_no[1][2]=9;
		
		//nested loop--row -0 to 1 and col--0 to 1
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(roll_no[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Length is as  :"+roll_no.length);
		System.out.println("Index value is as :"+roll_no[1][2]);
		
		

	}

}
