package few_java_topics;

public class Debuging {
     int x=90;
     // While debugging right click on code and then click on debug as java application
	//Resume button__
     //Step over button--Goes to next line
     //Terminate button is use to terminate the code
     //
     public void xyz() {
		System.out.println(x);
	}
	public static void verify() {
		
		Debuging d=new Debuging();
		System.out.println(d.x);
		}
	
	public int abc(int a) {
		return a;}
	
	public static void main(String[] args) {
		Debuging v= new Debuging();
		v.xyz();
		verify();
		v.abc(78);
		System.out.println(v.abc(25));
		}
}
