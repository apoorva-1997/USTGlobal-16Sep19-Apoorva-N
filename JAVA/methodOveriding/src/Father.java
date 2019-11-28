
public class Father {

	public void property () {
		System.out.println("property () father");
	}
	public void marry() {								//final and static methods cannot override
		System.out.println("asd");
	}
}

class Son extends Father{
	@Override
	public void marry() {
		System.out.println("sdf");
	}

}
 
