
public class Empconst {
	String name;
	int eid;
	public Empconst(String ename,	int id ) {
		name = ename;
		eid = id;
	}
	void printDetail(){
		System.out.println(name);
		System.out.println(eid);
	}

	public static void main(String[] args) {
		Empconst e = new Empconst("Apooo", 123);

		Empconst e1 = new Empconst("Amooo", 234);

		Empconst e2 = new Empconst("Ratna",345);
		
		e.printDetail();
		e1.printDetail();
		e2.printDetail();
		
		}
}

