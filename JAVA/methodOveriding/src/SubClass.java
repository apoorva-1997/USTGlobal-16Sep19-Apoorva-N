public class SubClass extends SuperClass{
	public void count() {
		System.out.println("inherited count() method");
	}
	public void add () {
		System.out.println("add() method");
	}
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		sc.count();
		SubClass sb = new SubClass();
		sb.count();
		sb.add();

	}
}