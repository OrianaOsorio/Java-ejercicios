public class pila
{
        public static void main (String[] args)
        {
		int hasta = 0 ;
		int [] pila ;
		System.out.print("Introduzca el numero de datos a cargar =>");
        	hasta = Leer.datoint();	
		pila = new int[hasta];
		for (int i=0;i<=hasta-1;i++)
		{
			pila[0] = Leer.datoint();	
			if (i!=hasta-1)
			{
				for (int j=i;j>=0;j--)
				{
					pila[j+1]=pila[j];
				}
			}		
		}
		System.out.println("Los datos de la nueva pila son:");
		for (int i=0;i<=hasta-1;i++)
		{
			System.out.println(pila[i]);
		}
	}
}
