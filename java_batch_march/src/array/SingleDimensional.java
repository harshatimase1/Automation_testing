package array;

public class SingleDimensional {

	public static void main(String[] args) {

		//integer number--1 D --by allocating memory
		
		//int [] a=new int[5];
		
		int a[]=new int[5];
		
		// Memory allocation : 4*5=20
		
		//float b[]=new float[6];
		//4*6=24 byte
				
				//long b[]=new long[7];
				//8*7=56 byte
		
		a[0]=10;
		//a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//a[5]=60;
		
		//for each loop 
		for(int i:a) {
			System.out.println(i);
		}
	
		System.out.println("---------------------Using For loop------------------");
		//for loop
		
		for(int j=0;j<5;j++) {
			System.out.println(a[j]);
		}
		
		System.out.println("The length of an array is: "+a.length);
		
		System.out.println("The value at index 3 is as : "+ a[3]);
		
	}

}
