
public class NonStaticBlocks {
	
	static int a;
	int b;
	
	
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1"); 	//non static block executes for every obj creation																																																										
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		
		NonStaticBlocks n = new NonStaticBlocks();
		System.out.println(n.a);
		System.out.println(n.b);
		
		NonStaticBlocks n1 = new NonStaticBlocks(); 
		System.out.println(n.a);
		System.out.println(n.b);
	
		System.out.println("main ended");
	}
	
	{
		System.out.println("non static block 2");
	}
}
