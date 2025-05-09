package array;

public class SingleDString {

	public static void main(String[] args) {

		String[] name = { "Sharvi", "Harsha", "Monika", "Priti", "Ujju", "Pranji", "Megha", "Vatu" };

//for each loop
		for (String j : name) {
			System.out.println(j);
		}
		System.out.println("Length of an array is :" + name.length);
		System.out.println();
		System.out.println("--------Using for loop----------------");
		
		//for loop
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("--------------------");
		System.out.println("Name of index 0 is :" +name[0]);

	}
}
