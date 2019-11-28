
public class TestA {
	public static int add (int a, int b) {
		System.out.println("add (int a, int b) method");
		return a + b;
	}
	public static double add (double a, int b) {
		System.out.println("add (double a, int b) method");
		return a + b;
	}
	public static void add (float a, int b) {
		System.out. println("add (float a, int b) method");
	}
	public static void multiply (float a, int b) {
		System.out.println("multiply (float a, int b) method");
	}
	public static double multiply (double a, int b) {
		System.out.println("multiply (double a, int b) method");
		return a + b;
	}
	public  double multiply (long a, int b) {
		System.out.println("multiply (long a, int b) method");
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("main (String[] args) method");
		main(10);
		add(10.2, 5);
		add(10.9, 4);
		add(4, 4);
		multiply(10.8, 9);
		multiply(2.5, 5);
		TestA t = new TestA();
		t.multiply(10, 2);
	}
	public static void main(int a) {
		System.out.println("main (int a) method");
	}
}
