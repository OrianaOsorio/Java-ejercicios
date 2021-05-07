public class serie2
{
        public static void main (String[] args)
        {

	int hasta = 0 ;
	int aux   = 1 ;

	System.out.print("Introduzca el tope de la serie =>");
        hasta = Leer.datoint();	

	for (int i=1;i<=hasta;i++)
	{
		aux=aux*2;
		System.out.print("1/"+aux+",");
	}

	}

}
