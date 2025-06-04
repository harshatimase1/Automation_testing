package string_001;

public class ForwardDirectionStringPrint {

	public static void main(String[] args) {
		
		String a="Automation";
		
		
//		for(int i=0;i<a.length();i++) {
//			System.out.println(a.charAt(i));
//			
//		}
		
		
		//print string in reverse direction
		
		for(int i=(a.length()-1);i>=0;i--) {
			//System.out.println(a.charAt(i));
			
			System.out.print(a.charAt(i));
		}
	
	}

}
