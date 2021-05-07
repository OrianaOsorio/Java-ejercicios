public class prog2 //muestra si es par
{
        public static void main (String[] args)
        {

        int    a= 0 ;

        System.out.print("Dame el valor de a : ");
        a = Leer.datoint();
	if (a%2==0)
	{
		System.out.println("El numero " + a +" es par");
	}
	else
	{
		System.out.println("El numero " + a +" es impar");
	}

        
        }
}
