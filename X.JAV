public class x
{
        public static void main (String[] args)
        {

	float  x        = 0f;
	float  x1       = 0f;
	float  n        = 1f;
	float  lleva    = 0f;
	int    n1       = 0;


	System.out.print("introduce x =>");
        x1 = Leer.datoFloat();	
	System.out.print("introduce n =>");
        n1 = Leer.datoint();	
	
	x=x1;

	for (int i=2;i<=n1;i++)
	{
	
		x=x*x1;
		n=i*n;
		lleva=lleva +x/n;
	}
	lleva=lleva+1+x1;

	System.out.println(lleva);
	
	}

}
