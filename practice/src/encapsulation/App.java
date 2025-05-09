package encapsulation;

public class App {
	
	private int pin_code=7890;
	
	private  void hide(int a) {
		pin_code=a;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		App v=new App();
		
		v.hide(1234);

	}

}
