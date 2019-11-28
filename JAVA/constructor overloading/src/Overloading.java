
public class Overloading {
	String name;
	int eid;
	long aadharno;
	Overloading(String name,int eid,long aadharno){
		this.name =name;
		this.eid = eid;
		this.aadharno = aadharno;
	}
	Overloading(String name,int eid) {
		this.name =name;
		this.eid = eid;
	}
	Overloading(int eid,String name) {
		this.name =name;
		this.eid = eid;
	}
	void display() {
		System.out.println(name);
		System.out.println(eid);
		System.out.println(aadharno);
	}
	public static void main(String[] args) {
		Overloading o1 = new Overloading("apooo", 22, 129098765);
		o1.display();
		
		System.out.println("*****************************");
		
		Overloading o2 = new Overloading("amogha", 34);
		o2.display();
		
		System.out.println("******************************");
		
		Overloading o3 = new Overloading(45, "ammu");
		o3.display();
	}
}

