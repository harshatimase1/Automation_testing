package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteDataWithScannerArray {

	public static void main(String[] args) {
		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		// for loop

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter values of indexes :" + i);

			a[i] = sc.nextInt();
		}
		System.out.println("Printing of an array as :" + Arrays.toString(a));

	}

}
