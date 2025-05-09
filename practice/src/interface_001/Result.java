package interface_001;

public class Result implements Interface_class, Interface_class2 {

	public static void main(String[] args) {
		Result r = new Result();
		r.name();
		r.xyz();
		System.out.println(r.a);
		System.out.println(r.f);
		System.out.println(r.l);

	}

	@Override
	public void name() {
		System.out.println("Sharvi");
	}

	@Override
	public void xyz() {
		System.out.println("Brand");
	}

	@Override
	public void Shar() {
		System.out.println("My daughter name is Sharvi");
	}

}
