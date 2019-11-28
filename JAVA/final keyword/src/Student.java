
public class Student {

	String name;
	int rollno;
	final String cname = "Sksvma";     //should initialize final keyword at deceleration or in constructor
	final int cid;

	Student(){
		this.cid = 20;				//should initialize final variables in each constructor
	}
	Student (String name ,int rollno ,int cid){

		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}

	final void printDetail() {
		System.out.println("Hi "+ name + " Welcome to  " +cname);
	}

	final void printDetail(String name) {
		System.out.println("Hi "+ name + " Welcome to  " +cname);    //can overload final method
	}

	
	public static void main(String[] args) {
		Student s = new Student("Apooo", 007, 10);
		s.printDetail();
		s.printDetail("Amoooooo");
		
	}
}
