package array;

public class SingleDimensionalArray {

	public static void main(String[] args) {

//declaration of array
		//approach 1
		
		/*int a[]=new int[5];//int[]a=new int[5];
		 
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approach 2
		
		int a[]= {100,200,300,400,500};
		
		//length of an array
		
		
		//System.out.println(a.length);
		
		//Read single value from an array
		//System.out.println(a[4]);
		
		//reading all the values from array
		
		//Normal for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//enhanced for loop
		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
