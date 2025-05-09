package array;

public class HetrogeniousArray {

	public static void main(String[] args) {

		Object []a= {100,90.5f,'S',"SHarvi",false};
		
		//for each loop
		for(Object x:a) {
			System.out.print(x+" ");
		}
		//System.out.println();
		System.out.println("\n------------------------------------");
		
		//for loop
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
