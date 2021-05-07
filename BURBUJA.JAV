public class burbuja
{
        public static void main (String[] args)
        {
		int hasta = 0 ;
		int [] arreglo ;
		int aux = 0;
		System.out.print("Introduzca el numero de datos a cargar =>");
        	hasta = Leer.datoint();	
		arreglo = new int[hasta];

		for (int i=0;i<=hasta-1;i++)
		{
			arreglo[i] = Leer.datoint();	
	
		}


		System.out.println("Los datos ordenados son:");
		

		for (int i2=0;i2<=hasta-2;i2++)

    		{
   			 for (int i=0 ;i<=hasta-2;i++)
   			{

			if (arreglo[i]>arreglo[i+1])
        		{
            			aux=arreglo[i+1];
          			arreglo[i+1]=arreglo[i];
           			arreglo[i]=aux;
        		}

    			}
   		}

		for (int i=0 ;i<=hasta-1;i++)
		{
			System.out.println(arreglo[i]);
		}



	}
}
