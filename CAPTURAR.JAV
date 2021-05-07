import java.io.*;

public class capturar_datos2
{
	public static int capturar() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cadena = "";
		try
		{
			cadena = br.readLine();
			return Integer.parseInt(cadena);
		}
		//el bloque finally se utiliza cuando no se utiliza el bloque catch
		//puede dejarse sin codigo
		finally
		{
			System.out.println("ingresaste el número " + cadena);
		}
	}
	
	public static void main(String arg[])
	{
		int num = 0;
		int i = 0; 
		System.out.println("Ingrese un número entre 1 y 20");
		try
		{
			num = capturar();
			if ((num <= 1) || (num >= 20))
			{
				System.out.println("el número se encuentra fuera del rango permitido");
				return;
			}
		}
		catch(IOException e)
		{
		}
		catch(NumberFormatException e)
		{
			System.out.println("¿Sí escribiste un número?");
		}
		while(i <= num)
		{
			System.out.println("el número " + i + " elevado al cuadrado es: " + Math.pow(2,i));
			i++;
		}
	}
}