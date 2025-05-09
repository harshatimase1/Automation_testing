package multiDarray;

public class DuplicateArrayValues {

	public static void main(String[] args) {

		int []a= {100,100,700,600,700,600,900,900,800};
		
		int num=700;
		int count=0;
		
		for(int value:a) {
			
			if(value==num) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
