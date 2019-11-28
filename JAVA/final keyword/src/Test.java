
final public class Test extends Student {		//final class can extend other class
	void add() {
		System.out.println("add method");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.add();
	}
}

