class Methodcirc
{
public static void main (String [] args)
{

double x =circ (4);
System.out.println("circ is " + x);

boolean c = oddeven (2);
System.out.print("num is " +c);

}

static double circ (float r)
{
double d = 2*3.142*r;
return d;
}

static boolean oddeven (float n)
{
if(n % 2 == 0)
{
return true;
}
else{
return false;
}

}

}