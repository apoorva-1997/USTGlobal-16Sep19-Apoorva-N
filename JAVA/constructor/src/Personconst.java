
public class Personconst {
	int age;
	String name;

	Personconst(String pname ,int page){
		name = pname;
		age = page;
	}
	public static void main(String[] args) {
		Personconst p = new Personconst("ASD", 22);
		System.out.println(p.name);
		System.out.println(p.age);

	}
}
