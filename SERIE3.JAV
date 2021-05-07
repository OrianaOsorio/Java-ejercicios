   public class serie3
   {
      public static void main (String[] args)
      {
      
         int suma  = 0 ;
         int n     = 0 ;
         int hasta = 0 ;
      
         System.out.print("Introduzca el tope de la serie =>");
         hasta = Leer.datoint();	
      
         for (int i=1;i<=hasta;i++)
         {
            n++;
            suma=suma+n;
            System.out.print(n + ",");	
         }
         System.out.println("");
         System.out.println("La suma es : "+suma);
      }
   
   }
