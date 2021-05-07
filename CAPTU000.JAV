import java.io.*;

public class capturar_datos
{
	public static void main(String arg[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String cadena;
		int num = 0;
		System.out.println("Ingrese un número entre el 1 y el 20");
		try
		{
			cadena = br.readLine();
			num = Integer.parseInt(cadena);
			if ((num <= 1) || (num >= 20))
			{
				System.out.println("El número se encuentra fuera del rango permitido");
				return;
			}
		}
		catch (Exception e)
		{
			if (e instanceof IOException)
			{
				System.out.println("Error de entrada/salida");
			}
			else if (e instanceof NumberFormatException)
			{
				System.out.println("Por favor ingresa un número entero");
			}
		}
		int i = 1;
		while (i <= num)
		{
			System.out.println("el número " + i + " elevado al cuadrado es: " + Math.pow(2,i));
			i++;
		}
	}	
}