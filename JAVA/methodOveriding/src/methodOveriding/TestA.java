package methodOveriding;

public class TestA {
	private void name() {
		System.out.println("a");
	}
}
class TestB extends TestA{
	private void name() {
		System.out.println("b");
	}
}