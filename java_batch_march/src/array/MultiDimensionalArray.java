package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//By allocating memory
		//row --2--col--3
		
		int[][]a=new int[2][3];
		
		//size of this array is  :2*3=6
		//memory allocation:4*2*3=24 byte 
		
		//row--index--0 to 1--outer loop
		//col--index--0 to 2--inner loop
		
		a[0][0]=12;
		a[0][1]=15;
		a[0][2]=16;
		
		a[1][0]=56;
		a[1][1]=34;
		a[1][2]=56;
		
		
		//nested for loop --outer loop--rows--inner --col
		
		for(int i=0;i<2;i++ ) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
			
			
		}
	//System.out.println("Length is as : " +a.length);
		System.out.println("Value lies on res index will be as:"+a[1][1]);
	}

}
