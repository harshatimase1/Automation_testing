package wrapper_class;

public class Wrapper_primitive {

	public static void main(String[] args) {
		Byte b = new Byte((byte) 50);

		byte a = b.byteValue();
		System.out.println(a);
		
		
		Character y=new Character('k');
		char d=y.charValue();
		System.out.println(d);

		
		Integer i=new Integer(70);
		int j=i.intValue();
		System.out.println(j);
		
		Float f=new Float(40.5f);
		float h=f.floatValue();
		System.out.println(h);
	}

}
