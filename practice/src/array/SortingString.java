package array;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		//char a[] = { 'C', 'D', 'E', 'A' };
		
		String b[]= {"John","Marry","David","Scott"};
		
		System.out.println("Befor sorting....."+Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("After sorting ....."+Arrays.toString(b));

	}
}
