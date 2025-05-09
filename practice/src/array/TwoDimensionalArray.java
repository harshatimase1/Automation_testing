
package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// Approach 1
		/*
		 * int a[][]=new int[3][2]; a[0][0]=100; a[0][1]=200;
		 * 
		 * a[1][0]=300; a[1][1]=400;
		 * 
		 * a[2][0]=500; a[2][1]=600;
		 */

		// Approach 2

		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		// Find size of an array
		System.out.println("length of rows :" + a.length);
		System.out.println("length of columns :" + a[0].length);

		// read single value from an array
		// System.out.println(a[2][1]);//second row and 1st column

		// normal for loop

		/*
		 * for(int r=0;r<=a.length-1;r++) {
		 * 
		 * for(int c=0;c<=a[r].length-1;c++) { System.out.print(a[r][c]+" "); }
		 * System.out.println();
		 */

		// Enhance for loop
		for (int arr[] : a) {

			for (int x : arr) {
				System.out.println(x + " ");
			}
			System.out.println();
		}

	}

}
