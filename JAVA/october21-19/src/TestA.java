
public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		
		p.brand = "Bright";
		p.color = "Black";
		p.cost = 20;
		
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		p.write();
	}
}
