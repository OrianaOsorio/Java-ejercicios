public class prog4 //muestra si son iguales, o el mayor y menor.
{
        public static void main (String[] args)
        {

        int    a= 0  ;
        int    b= 0  ;
	int    c= 0  ;

        System.out.print("Dame el valor de a : ");
        a = Leer.datoint();

        System.out.print("Dame el valor de b : ");
        b = Leer.datoint();

        System.out.print("Dame el valor de c : ");
        c = Leer.datoint();

	 

	if (a==b&&a==c)
	{
		System.out.println("Los numeros a,b y c son iguales");
	}
else if (a==b&&a>c)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + a +" es el mayor");
		System.out.println("El numero " + c +" es el menor");
	}
	else if (a==b&&a<c)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + c +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (a==c&&a<b)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (a==c&&a>b)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (b==c&&b>a)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (b==c&&b<a)
	{
		System.out.println("Dos son iguales");
		System.out.println("El numero " + a +" es el mayor");
		System.out.println("El numero " + b +" es el menor");
	}

	else if (a>b&&a>c&&b>c)
	{
		System.out.println("El numero " + a +" es el mayor");
		System.out.println("El numero " + c +" es el menor");
	}

        
	else if (a>b&&a>c&&c>b)
	{
		System.out.println("El numero " + a +" es el mayor");
		System.out.println("El numero " + b +" es el menor");
	}
	
	else if (b>a&&b>c&&c>a)
	{
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (b>a&&b>c&&a>c)
	{
		System.out.println("El numero " + b +" es el mayor");
		System.out.println("El numero " + c +" es el menor");
	}
	else if (c>b&&c>a&&c>a)
	{
		System.out.println("El numero " + c +" es el mayor");
		System.out.println("El numero " + a +" es el menor");
	}
	else if (c>b&&c>a&&c>b)
	{
		System.out.println("El numero " + c +" es el mayor");
		System.out.println("El numero " + b +" es el menor");
	}
	
        
        }

}
