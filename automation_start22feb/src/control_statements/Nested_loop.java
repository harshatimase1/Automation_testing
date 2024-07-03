package control_statements;

public class Nested_loop {

	public static void main(String[] args) {
		
		
		/* outer loop and inner loop
		  inner loop executes each time for outer loop till all conditions gets true
		  Syntax -
		  for(initialize variable;condition;increment or decrement){
		 //block of code;
		 
		 for(initialize variables; conditions; increment or decrement) {
			 //block of code;}
		 }*/

		
		
		for(int a=1; a<=5; ++a) {
			System.out.println("The value of outer loop is : " +  a);
			
			for(int b=7; b<10; ++b) {
				System.out.println(b+"  ");}
		}

}}
