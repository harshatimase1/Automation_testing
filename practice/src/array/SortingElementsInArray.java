package array;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {

		int a[]= {100,600,400,200,300};
		System.out.println("Before sorting.....");
		System.out.println(Arrays.toString(a));//[100,600,400,200,300]
		
		Arrays.sort(a);//sort elements in array
		
		System.out.println("After Sorting....");
		System.out.println(Arrays.toString(a));//
		
		
	}

}
