package array;

public class SingleDWithoutAllocatingMemory {

	public static void main(String[] args) {
		//declaration of array without allocating memory
		
		float[] percent= {22.2f,32.2f,34.5f,56.9f};
		
		System.out.println("Length of an array :" +percent.length);
		
		//for each loop
		for(float i:percent) {
			System.out.print(i);
		}

		System.out.println();
		System.out.println("-------Using For loop--------------");
		for(int b=0;b<percent.length;b++) {
			System.out.println(percent[b]);
		}
	}

}
