package array;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 400, 100, 100, 200 };
		int num = 100;
		int count = 0;

		for (int value : a) {
			if (value == num) {
				count++;
			}

		}
		System.out.println(count);

	}

}
