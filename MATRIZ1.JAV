public class matriz1
{
	public static void main (String[] args)
    {
    	int tam = 0 ;//tamaño vector
		int [] matriz ;
		int buscar = 0;
		int en = 0;
		boolean encontrado = false;
		
		System.out.print("Introduzca el numero de datos a cargar ");
        tam = Leer.datoint();	
		matriz = new int[tam];
		
		for (int i=0;i<=tam-1;i++)
		{
			System.out.println("Intorduzca número");
			matriz[i] = Leer.datoint();	
		}
		
		System.out.println("Los datos de la matriz son:");
		for (int i=0;i<=tam-1;i++)
		{
			System.out.println(matriz[i]);
		}
		
		System.out.print("El numero que desea buscar es: ");
		buscar = Leer.datoint();
		for (int i=0;i<=tam-1;i++)
		{
			if (buscar == matriz[i])
			{
				encontrado = true;
				en=i;	
			}
		}
		if (encontrado==true)
		{
			System.out.println("El numero ha sido encontrado en la locacion: " + en);
		}
		else
		{
			System.out.println("no ha sido encontrado");
		}
	}
}
