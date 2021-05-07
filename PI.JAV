   public class pi
   {
      public static void main (String[] args)
      {
      
         float  almacena = 8f/3f;
         float  up       = 4f;
         float  down     = 3f;
         int     mete     = 0;
         boolean upb      = false;
         boolean downb    = true;
      
      
         System.out.println("Hasta donde desea aproximar?");
         mete = Leer.datoint();	
         for (int i=1;i<=mete;i++)
         {
            almacena = almacena * (up/down);
         
            if (upb == true)
            {
               up  = up+2;
               upb = false;
            }
            else 
            {
               upb = true;
            }	
         
         
            if (downb == true)
            {
               down  = down+2;
               downb = false;
            }	
            else
            {
               downb = true;
            }
         
         }
         System.out.println("El valor aproximado de pi es : "+almacena);
      
      }
   
   }
