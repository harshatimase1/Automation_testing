package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int a[]= {1000,800,900,200,400,500};
		
		System.out.println("Befor sorting ......");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting .....");
		
		System.out.println(Arrays.toString(a));
		
	
	}

}
