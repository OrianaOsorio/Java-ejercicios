   import java.io.*;
        public class Leer
	{
             public static String dato()
              {
                String sdato = " ";
                try
                {
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader FlujoE = new BufferedReader(isr);
                   sdato=FlujoE.readLine();
                }
                catch(IOException e)
                {
                   System.err.println("Errors:" + e.getMessage());
                }
                return sdato;
              }

             public static short datoShort()
             {
                try
                {
                   return Short.parseShort (dato());
                }
                catch (NumberFormatException e)
                {
                   return Short. MIN_VALUE;
                }
             }

             public static int datoint()
             {
                try
                {
                   return Integer.parseInt (dato());
                }
                catch (NumberFormatException e)
                {
                   return Integer. MIN_VALUE;
                }
             }

             public static double datoDouble()
             {
                try
                {
                   return Double.parseDouble (dato());
                }
                catch (NumberFormatException e)
                {
                   return Double. NaN;
                }
             }
             public static float datoFloat()
             {
                try
                {
                   return Float.parseFloat (dato());
                }
                catch (NumberFormatException e)
                {
                   return Float. NaN;
                }
             }

             public static long datoLong()
             {
                try
                {
                   return Long.parseLong (dato());
                }
                catch (NumberFormatException e)
                {
                   return Long.MIN_VALUE;
                }
             }
	}
                            
