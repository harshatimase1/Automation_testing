package encapsulation;

public class DataHidden {

	private int pin_code=5643;
	
	private void password(int a) {
		pin_code=a;
		System.out.println(pin_code);
		
	}
	
	public static void main(String[] args) {
		DataHidden d=new DataHidden();
		d.password(9087);
		System.out.println(d.pin_code);
	
	}

}
