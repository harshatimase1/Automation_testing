package array;

public class ArrayInteger {

	public static void main(String[] args) {
//single dimentional array declaration
		int[] name = new int[5];

		name[0] = 15;
		name[1] = 20;
		name[2] = 30;
		name[3] = 45;
		name[4] = 50;
		

		// for each loop
		/*for (int i : name) {
			System.out.println(i);
		}*/
		
		//using for loop
		for(int i=0;i<5;i++) {
			System.out.println(name[i]);
			
		}

		System.out.println("---------");
		System.out.println("Length of an array is : "+name.length);
		System.out.println("Value at index 4 is as :"+name[4]);
	}

}
