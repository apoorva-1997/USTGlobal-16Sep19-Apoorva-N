
public class TestB {
	public static void main(String[] args) {

		Van v = new Van();

		v.cost = 10000;
		v.color = "Grey";

		System.out.println("cost is " +v.cost);
		System.out.println("color is "+v.color);
		v.move();
		
		System.out.println("*************************************************");
		
		Van v1 = new Van();
		v1.cost = 20000;
		v1.color = "Blue";
		

		System.out.println("cost is " +v1.cost);
		System.out.println("color is "+v1.color);
		v1.move();
	}
}
