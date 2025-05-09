package multiDarray;

public class SearchElementsInArray {

	public static void main(String[] args) {

		int[] a = { 400, 500, 300, 200, 100 };

		int search_element = 100;

		boolean status = false;//false --found--true--not found

		for (int x : a) {

			if (x == search_element) {
				System.out.println("Element Found");
				status = true;
				break;
			}

		}

		if (status == false) {
			System.out.println("Element Not found");
		}

	}
}
