package array;

public class SingleDString {

	public static void main(String[] args) {

		String []name=new String[7];
		
		name[0]="Sharvi";
		name[1]="Ujju";
		name[2]="princes";
		name[3]="john";
		name[4]="michal";
		name[5]="Jaksaon";
		name[6]="Joshi";
	
		
		//for each/enhance
		for(String k:name) {
			System.out.println(k);
		}
		
		System.out.println("The length of is :"+(name.length));
		System.out.println("The value of 6 index is as :"+name[6]);
		
		
		System.out.println("-------------------------------");
		
		//for loop
		
		for(int j=0;j<name.length;j++ ) {
			System.out.println(name[j]);
		}
	}

}
