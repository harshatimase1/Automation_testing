package array;

public class SingleDimensionalString {

	public static void main(String[] args) {
//second way of declaration of an array
		String student[]=new String[4];
		
		student[0]="Sharvi";
		student[1]="Harsha";
		student[2]="Ranjana";
		student[3]="Timase";
		
		//for each 
		for(int i=0;i<4;i++) {
			System.out.println(student[i]);
		}
		
		System.out.println("---------------------------------------");
		//for each loop
		for(String i:student) {
			System.out.println(i);
		}
		
		
	}

}
