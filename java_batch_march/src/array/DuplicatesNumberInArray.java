package array;

 public class DuplicatesNumberInArray {

	public static void main(String[] args) {
		int[] a = { 300, 500, 500, 500, 300, 600, 700, 800, 700, 800, 900 };
		
		int num=500;
		int count=0;
		
		for(int values:a) {
			if(values==num) {
				count++;
			}
			
		}
		System.out.println(count);

	}
}
