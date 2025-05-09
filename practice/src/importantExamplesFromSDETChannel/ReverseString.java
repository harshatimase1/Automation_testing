package importantExamplesFromSDETChannel;

public class ReverseString {

	public static void main(String[] args) {
		// Approach 1: length, charAt
		
		  String s = "Selenium"; 
		  String rev = " ";
		  
		  for (int i = s.length() - 1; i >= 0; i--) { 
			  
		  //System.out.println(s.charAt(i)); 
		  rev = rev + s.charAt(i); }
		  System.out.println("The reverse string is :" + rev);
		 
	}
	
	
}

