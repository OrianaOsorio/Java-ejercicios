public class matriz2
{
        public static void main (String[] args)
        {
		int renglones = 0 ;
		int columnas = 0;
		int [][] matriz ;
		int aux = 0;
		System.out.print("Introduzca el numero de renglones a cargar =>");
        	renglones = Leer.datoint();	
		System.out.print("Introduzca el numero de columnas a cargar =>");
        	columnas = Leer.datoint();	
		matriz = new int[renglones][columnas];
		for (int i = 0;i<=renglones-1;i++)
		{
			for (int j = 0;j<=columnas-1;j++)
			{
				System.out.print("Introduzca el dato ["+i+"]["+j+"] =>");
				matriz[i][j]= Leer.datoint();	
			}
		}
		System.out.println("Desplegada de forma normal:");
		for (int i = 0;i<=renglones-1;i++)
		{
			for (int j = 0;j<=columnas-1;j++)
			{
				System.out.print(matriz[i][j]+" ");

			}
			System.out.println("");
		}

		System.out.println("Desplegada de forma inversa:");
		for (int j = 0;j<=columnas-1;j++)
		{
			for (int i = 0;i<=renglones-1;i++)
			{
				System.out.print(matriz[i][j]+" ");

			}
			System.out.println("");
		}

	}
}
