
public class StaticBlocks {
	static int a;
	int b;
	static {
		a = 2;
		System.out.println("static block 1");    //static block executes first and then constructor
	}
	public StaticBlocks() {
		b = 5;
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		StaticBlocks s = new StaticBlocks();
		System.out.println("a value is " +a);
		System.out.println("b value is " +s.b);	
	}
	static {
		a = 20;
		System.out.println("static block 2");
	}
	static {
		a = 40;
		System.out.println("static block 3");
	}
}
