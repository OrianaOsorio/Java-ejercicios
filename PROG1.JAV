public class prog1
{
        public static void main (String[] args)
        {

        double    a= 0 ;
        double    b= 0 ;
        double    c= 0 ;

        System.out.print("Dame el valor de a : ");
        a = Leer.datoDouble();

        System.out.print("Dame el valor de b : ");
        b = Leer.datoDouble();

        c=a+b;
	System.out.println("La suma es : " + c);
	c=a-b;
	System.out.println("La resta es : " + c);
	c=a*b;
	System.out.println("La multiplicacion es : " + c);
	c=a/b;
	System.out.println("La division es : " + c);
        }
}
