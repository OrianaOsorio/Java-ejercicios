public class LeerDatos
{
        public static void main (String[] args)
        {
        short     dato_short = 0 ;
        int       dato_int   = 0 ;
        long      dato_long  = 0 ;
        float     dato_float = 0 ;
        double    dato_double= 0 ;
        System.out.print("Dame el dato tipo short: ");
        dato_short = Leer.datoShort();

        System.out.print("Dame el dato tipo int: ");
        dato_int = Leer.datoint();

        System.out.print("Dame el dato tipo long: ");
        dato_long = Leer.datoLong();

        System.out.print("Dame el dato tipo float: ");
        dato_float = Leer.datoFloat();

        System.out.print("Dame el dato tipo double: ");
        dato_double = Leer.datoDouble();

	System.out.println("Dato tipo short: " + dato_short);

	System.out.println("Dato tipo int: " + dato_int);

	System.out.println("Dato tipo long: " + dato_long);

	System.out.println("Dato tipo float: " + dato_float);

	System.out.println("Dato tipo double: " + dato_double);
        }
}
