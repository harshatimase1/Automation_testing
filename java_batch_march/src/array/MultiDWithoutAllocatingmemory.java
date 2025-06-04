package array;

public class MultiDWithoutAllocatingmemory {

	public static void main(String[] args) {
//without allocating memory
		
		int[][]a= {{2,4,5,3},{9,7,6,4},{5,3,9,5}};
		
	//nested for--row--0 to 2--col--0 to 3
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("Value of index :"+a[1][2]);
		
	}

}
