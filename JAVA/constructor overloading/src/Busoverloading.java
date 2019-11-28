
public class Busoverloading {
int seats;
String color;

public Busoverloading(int seats, String color) {
this.color = color;
this.seats =seats;
}
Busoverloading ()
{
	this(40);
}
 Busoverloading (int seats){
	 this(seats,"red");
 }
 void getDetails() {
	 System.out.println("Welcome to redbus, bus seat capacity "+seats);
	 System.out.println(color);
 }
 public static void main(String[] args) {
	Busoverloading b = new Busoverloading();
	b.getDetails();
	Busoverloading b1 = new Busoverloading(50);
	b1.getDetails();
	Busoverloading b2 = new Busoverloading(50, "blue");
	b2.getDetails();
}
}
