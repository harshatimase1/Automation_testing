package inheritance;

//is -a relationship--extends
public class Password extends Username{
	
	float f=56.7f;

	public static void main(String[] args) {
		Password p=new Password();
		System.out.println(p.f);
		System.out.println(p.a);
		p.name();
		name1();
		

	}

}
