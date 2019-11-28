
public class Emp1const {
	String name;
	int eid;
	public Emp1const(String name, int eid ) {
		this.name = name;
		this.eid = eid;
	}
	void printDetail(){
		System.out.println(name);
		System.out.println(eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello " +name+"Welcome to company");
	}

	public static void main(String[] args) {
		Emp1const e = new Emp1const("Apoo", 123);
		e.printDetail();

		Emp1const e1 = new Emp1const("Apoooooo", 345);
		e1.printDetail();

		Emp1const e2 = new Emp1const("Apooooooooo", 456);
		e2.printDetail();
	}
}


