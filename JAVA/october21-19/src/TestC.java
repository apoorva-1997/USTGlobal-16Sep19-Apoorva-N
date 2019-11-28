
public class TestC {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.color = "White";
		c.name = "xyz";
		c.eating();
		c.sleep();
		System.out.println("color of cow is "+c.color);
		System.out.println("name of cow is "+c.name);
		
		System.out.println("******************************************");
		
		Cow c1 = new Cow();
		c1.color = "black";
		c1.name = "asd";
		c1.eating();
		c1.sleep();
		System.out.println("color of cow is "+c1.color);
		System.out.println("name of cow is "+c1.name);
	}
}
