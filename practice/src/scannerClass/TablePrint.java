package scannerClass;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value");
		int i= sc.nextInt();
		
		//to print table 5
		
		for(int j=1;j<=10;j++) {
			//System.out.println((i*j));
			System.out.println(i+"*"+j+"="+(i*j));
		}
	
	}

}
