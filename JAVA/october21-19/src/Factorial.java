public class Factorial {
	static int facto (int n) {
	int fact = 1;
		for (int i = 1 ;i <=n ; i++)
	{
		fact = fact * i;
	}
		return fact;
}


public static class main{
	public static void main (String[] args) {
		int c = facto (4);
		System.out.println("factorial of num is "+c);
	}
}
}