
public class TestD {
	public static void main(String[] args) {

		Person p = new Person();

		p.name = "xyz";
		p.age = 21;
		Person.color = "white";
		Person.sleep();
		p.walk();
		p.eat();
		
		System.out.println("person color is "+Person.color);
		System.out.println("person name is "+p.name);
		System.out.println("person age is "+p.age);
	}
}