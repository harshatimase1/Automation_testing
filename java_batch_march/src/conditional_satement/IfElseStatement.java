
package conditional_satement;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int person_age=25;
		
		if(person_age<=18) {
			System.out.println("Eligible for vote");
		}else {
			
			System.out.println("Not eligible for vote");
	
		}
		
		
		System.out.println("--------------------------------------");
		
		int a=100;
		if(a>200) {
			System.out.println("Value of a");
		}
		else {
			System.out.println("None");
		}
		
		System.out.println("------------------Even Number/Odd Number------------------------");
		
		//10%2==0;---even
		//11%2!=0;--odd

		int num=10;
		
		if(num%2!=0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	
	
	}

}
