
public class DefaultValues {
	static int a =25;
	boolean x;  						//global variables take default values
	static DefaultValues d;
	public static void add () {
		final int a; 					// only final assess modifier is supported for local modifier
		int b;
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		DefaultValues d = new DefaultValues();
		System.out.println("value of x "+d.x);
	}
}
