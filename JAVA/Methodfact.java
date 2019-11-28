class Methodfact
{
public static void main (String [] args)
{

int x = facto (4);
System.out.print("fact of " + x);


}

static int facto(int n)
{
int fact = 1;

for (int i = 1 ; i <= n ; i ++)
fact=  fact * i;
return fact;
}


}