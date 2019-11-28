
public class Student {
	int rollno;
	String name;
	String branch;
	char section;
	double marks;

	public Student (int rollno,String name,double marks,String branch,char section) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.branch = branch;
		this.section = section;
	}
	void display() {
		System.out.println(name);
		System.out.println(marks);
		System.out.println(branch);
		System.out.println(rollno);
		System.out.println(section);
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Apoorva", 88, "ECE", 'A');
		Student s2 = new Student(2, "Amogha", 99, "CSE",'B');
		Student s3 = new Student(3, "Paru", 22, "MECH", 'D');
		Student s4 = new Student(4, "Megha", 33, "CIVIL", 'A');
		Student s5 = new Student(5, "Vijju", 55, "ECE", 'C');
		Student s6 = new Student(6, "John", 44, "ISE", 'A');
		Student s7 = new Student(7, "Mark", 34, "CSE", 'E');
		Student s8 = new Student(8, "Ammu", 45, "ISE", 'B');
		Student s9 = new Student(9, "Pinkey", 67, "MECH", 'D');
		Student s0 = new Student(10, "Kushi", 87, "CIVIL", 'E');
		s1.display();
		System.out.println("*****************************************");
		s2.display();
		System.out.println("*****************************************");
		s3.display();
		System.out.println("*****************************************");
		s4.display();
		System.out.println("*****************************************");
		s5.display();
		System.out.println("*****************************************");
		s6.display();
		System.out.println("*****************************************");
		s7.display();
		System.out.println("*****************************************");
		s8.display();
		System.out.println("*****************************************");
		s9.display();
		System.out.println("*****************************************");
		s0.display();
	}
}
