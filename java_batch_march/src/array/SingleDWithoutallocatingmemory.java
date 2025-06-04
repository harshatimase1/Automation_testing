package array;

public class SingleDWithoutallocatingmemory {

	public static void main(String[] args) {
		
		float [] percent = { 23.5f,12.5f,45.7f,67.7f};
		
		//for each loop
		
		for(float i:percent) {
			System.out.println(i);
		}
	
		System.out.println("Length of an array is as :"+percent.length);
		
		//for loop 
		
		System.out.println("----------------Using for loop -----------------------");
		for(int j=0;j<percent.length;j++) {
			System.out.println(percent[j]);
		}
		
	}

}
