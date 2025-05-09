package array;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[]= {100,10.5,'S',"Welcome",true};
		
		/*for(Object x:a) {
			System.out.println(x);*/
		
		//Using normal for loop
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
