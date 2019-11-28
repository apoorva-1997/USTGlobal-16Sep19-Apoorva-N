
public class TestI {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		System.out.println("**********************");
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		System.out.println("******************");
		
		Lion l = new Lion();
		l.eat();
		l.roar();
	}
}
