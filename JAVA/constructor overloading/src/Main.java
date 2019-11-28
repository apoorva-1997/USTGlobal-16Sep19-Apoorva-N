
public class Main {
	final void add (){
		System.out.println("add () method");
	}
	final void add(int a) {
		System.out.println("add (int a) method");
	}
	public static void main(String[] args) {
		Superclass sup = new Superclass();
		System.out.println("*****************");
		Subclass sub = new Subclass();
		sub.getSData();
		Main m = new Main();
		m.add();
		m.add(10);
	}
}
