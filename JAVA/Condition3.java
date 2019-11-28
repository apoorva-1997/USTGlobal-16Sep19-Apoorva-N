    class Condition3
   {
         public static void main (String [] args)
	{
	    int height = 30;
	    double weight = 60;
	    double bmi = weight/(height*height);
	
	 if (bmi < 18.5)
	{
	        System.out.println("you are in the underweight range");
	 }
	else if ( bmi >= 18.5 && bmi <= 24.9)
	{
	         System.out.println("you are in the healthy weight range");
	}	 
	else if ( bmi >= 25 && bmi <= 29.9)
	{
                          System.out.println("you are in the overweight range");
	}
	else if ( bmi >= 30 && bmi <= 39.9)
	{
	        System.out.println("you are in the obese range");
	}	
	}
   } 