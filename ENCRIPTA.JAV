//encripta.java         



import java.io.*; //libreria de entrada / salida
import java.lang.*; //Libreria del lenguaje



public class encripta //Nombre de la clase
{
        public static void main (String[] args)
        {
		//Variables utilizadas
		String lsdato_entrada="";
		String lsdato_salida ="";
		char lc_comodin;
		
		System.out.println("Introduzca los datos a encriptar:");		
		//Aqui se cargan los datos a encriptar
                try
                {
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader texto = new BufferedReader(isr);
                   lsdato_entrada=texto.readLine();
                }
                catch(IOException e) //Muestra si hay errores al cargar los datos
                {
                   System.err.println("Errors:" + e.getMessage());
                }   

		//Aquí empieza la encriptación por método ASCII, al valor de cada letra
		//Le suma el valor de su posición y lo va concatenando en una nueva variable
		for (int i=0;i<=lsdato_entrada.length()-1;i++)
		{

			lc_comodin=lsdato_entrada.charAt(i);

			for (int i2=0;i2<=lsdato_salida.length();i2++)
			{

				lc_comodin++;

			}
			lsdato_salida=lsdato_salida+lc_comodin;

		}

		//Despliega el resultado encriptado
		System.out.println(lsdato_salida);
		//Inicializa la variable para desencriptar
		lsdato_entrada = lsdato_salida;

		lsdato_salida = "";
		//Aquí desencripta utilizando el mismo concepto, pero le resta en lugar de sumar
		//Para obtener el valor original
		for (int i=0;i<=lsdato_entrada.length()-1;i++)
		{

			lc_comodin=lsdato_entrada.charAt(i);

			for (int i2=0;i2<=lsdato_salida.length();i2++)

			{

				lc_comodin--;

			}

			lsdato_salida=lsdato_salida+lc_comodin;

		}
		//Muestra la cadena desencriptada
		System.out.println(lsdato_salida);

	}


	
}





