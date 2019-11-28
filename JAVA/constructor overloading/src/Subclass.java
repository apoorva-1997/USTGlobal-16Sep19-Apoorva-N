
public class Subclass extends Superclass{
	String s = "subclass avrible";
	Subclass(){
		super();
		System.out.println("sub class constructor");
	}
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*******************************");
		super.SuperclassMethod();
	}
}
