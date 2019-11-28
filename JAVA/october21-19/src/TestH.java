
public class TestH {
	public static void main(String[] args) {
		Firstgen f = new Firstgen();
		f.msg();
		f.call();

		System.out.println("*******************************");

		Secondgen s = new Secondgen();
		s.call();
		s.msg();
		s.games();

		System.out.println("*******************************");

		Thirdgen t = new Thirdgen();
		t.msg();
		t.call();
		t.games();
		t.call();
	}
}
