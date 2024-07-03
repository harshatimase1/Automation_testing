package few_java_topics;

public class StringMethods {

	public static void main(String[] args) {
		/* There are 2 ways of declaring string 1)By literal 2) Using new keyword
		1)By literal way: String a="Automation" ' String b="Automation, String c="Manual"
       Storage is done with reference to the value of variable in heap area in SCP(string constant pool)
       a=b="Automation" and c="Manual"
       
       2)Using new keyword: Two objects are created here a) In heap area b)In SCP area
         String q="Manual";
         String w="Manual";
         String e="Functional";
         
         a)Heap area: Storage is done with reference to the variable ---  q="Manual" , w="Manual"and e="Functional"
         b)String constant pool: Storage is done with reference to the value of variable---q=w="Manual" and e="Functional"
       
        
		//StringMethods: We can apply method on string literal and string object. We can use method with the help of string variables
		1)length();  --to get the length of character in int */
		
		String name= "Stp infotech";
		System.out.println("Output of length method is : "+name.length());
		
		//2)replace("old char","new char";): To replace some character from given string 
		
		String d="Pune city";
		System.out.println("Output of replace method is :" +d.replace("Pune", "Mumbai"));
		
		//3)indexOf("character"); To get index/position of character in string. The index starts from zero. it couts space also.
		
		String l="Sharvi";
		String k="Harsha";
		System.out.println(k.indexOf("r"));
		System.out.println("The outpur of indexof is : " +l.indexOf("i"));
		
		//4)substring(int begining index):NEED TO CLEAR THIS METHOD
		
		String d1 = "Automation";
		System.out.println(d1.substring(4));
		String name1  = "Stp Infotech";		
		System.out.println(name1.substring(0,3));
		
		//5)charAt(int index);--To get character with respect to index
		
		String o="Google company";
		System.out.println(o.charAt(5));
		System.out.println("The output of charAt method is : " +o.charAt(0));
		
		//6)concat(another string);--To add another string in given string
		
		String s="International";
		String g="Singer";
		System.out.println(s+g);
		System.out.println("Sharvi is an : "+s+" "+g);
		
		//7)toLowerCase();--to make string in lower case
		
		String f="INTOUCH";
		System.out.println(f.toLowerCase());
		
		//8)toUpperCase();--to make string in Upper case
		
		String r="my mother is the best person in the world";
		System.out.println(r.toUpperCase());
		
		
		//9)isEmpty();--check string empty or not output in boolean(true or false)
		
		String x="Thank you God";
		System.out.println("The output of isEmpty method is:  "  +x.isEmpty());
		
		//10)contains("specified string or not"); --Output in true or false
		
		String m="Internation swimmer";
		System.out.println("The output of contains method is: " +m.contains("swi"));
		
		//11)expected.equals(actual); To compare the expected and actual string value.if the value is true then result is true
		
		String expected="www.takeda.com";
		String  actual= "www.akeda.com";
		System.out.println("The output of expected.equals(actual) is :  "+expected.equals(actual));
		
		//12)expected.equalsIgnoreCase(actual)--To compare actual and expected value along with the Case.
		
		String expected1="DUBAI";
		String actual1="Dubai";
		System.out.println("The output of expected.equalsIgnoreCase(actual) is : " +expected1.equalsIgnoreCase(actual1));
		
		//13)endsWith(); ---To check if particular string ends with suffix or not.
		
		String t="Automation test engineer";
		String y="Manual testing ";
		System.out.println("The output of endsWith method is: " +t.endsWith("eer"));
		System.out.println("The output of endsWith method is: "+y.endsWith("Ma"));
		
		//14) trim: to remove the space before and after the value of string 
		
		String w="     Lata Mangeshkar was very good singer         ";
		
		System.out.println("The output of trim method is : " + w.trim());
		
	}
}
