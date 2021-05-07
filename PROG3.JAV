public class prog3 //muestra si son iguales, o el mayor y menor.
{
        public static void main (String[] args)
        {

        int    a= 0 ;
        int    b= 0 ;

        System.out.print("Dame el valor de a : ");
        a = Leer.datoint();

        System.out.print("Dame el valor de b : ");
        b = Leer.datoint();

	if (a==b)
	{
		System.out.println("Los numeros a y b son iguales");
	}
	else if (a>b)
	{
		System.out.println("El numero " + a +" es el mayor");
		System.out.println("El numero " + b +" es el menor");
	}
	else
	{
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
        
        }

}
