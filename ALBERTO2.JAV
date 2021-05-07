import java.util.regex.*;
import java.io.*;



public class alberto2 {
   public static void main(String[] args) throws Exception { 

	System.out.println("Introduzca su nombre");
	System.out.print("=>");
		String name = " ";
                try
                {
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader FlujoE = new BufferedReader(isr);
                   name=FlujoE.readLine();
                }
                catch(IOException e)
                {
                   System.err.println("Errors:" + e.getMessage());
                }    
boolean sigue = true;
boolean encontrado = false;
int sec = 0;
while (sigue == true)
{
	sec++;
	System.out.println(name+", que deseas saber del futuro ?");
	System.out.print("=>");
		String input = " ";
                try
                {
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader FlujoE = new BufferedReader(isr);
                   input=FlujoE.readLine();
                }
                catch(IOException e)
                {
                   System.err.println("Errors:" + e.getMessage());
                }    
           


      Pattern p = Pattern.compile("cuando");
      Matcher m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
	if(sec==1)
      	System.out.println("Muy pronto, no te apresures");
	if(sec==2)
      	System.out.println("Tal vez en unos meses");
	if(sec==3)
      	System.out.println("Podrian ser 100 años!!!");
	if(sec==4)
      	System.out.println("Mentiria si digo mañana ...");
	if(sec==5)
      	System.out.println("Es raro, debio haber sido hace 3 meses");
	if(sec==6)
      	System.out.println("Mejor espera sentado ...");



	encontrado=true;
      }

       p = Pattern.compile("salir del programa");
       m = p.matcher(input);
            if (m.find()) 
      {
      
      	sigue=false;
	encontrado=true;
	}


      p = Pattern.compile("cuant");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
	if(sec==1)
      	System.out.println("4");
	if(sec==2)
      	System.out.println("10");
	if(sec==3)
      	System.out.println("3");
	if(sec==4)
      	System.out.println("12");
	if(sec==5)
      	System.out.println("20");
	if(sec==6)
      	System.out.println("8");
	encontrado=true;
      }

      p = Pattern.compile("llama");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Alberto");
	if(sec==2)
      	System.out.println("Hugo");
	if(sec==3)
      	System.out.println("Carlos");
	if(sec==4)
      	System.out.println("Armando");
	if(sec==5)
      	System.out.println("Gabriel");
	if(sec==6)
      	System.out.println("Claudia");
	encontrado=true;
	}


       p = Pattern.compile("como");
      m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Con un poco de suerte ...");
	if(sec==2)
      	System.out.println("Haste de la vista gorda");
	if(sec==3)
      	System.out.println("Eso preguntaselo a tu madre");
	if(sec==4)
      	System.out.println("Asalta un banco y sal en la tele.");
	if(sec==5)
      	System.out.println("Reza 10 padres nuestros");
	if(sec==6)
      	System.out.println("No te avientes a un puente");
	encontrado=true;
	}

       p = Pattern.compile("donde");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("En donde menos lo esperes");
	if(sec==2)
      	System.out.println("En cualquier lugar ...");
	if(sec==3)
      	System.out.println("En donde tu lo planees");
	if(sec==4)
      	System.out.println("En tu casa");
	if(sec==5)
      	System.out.println("Solo en el paraiso");
	if(sec==6)
      	System.out.println("En el cementerio");
	encontrado=true;
	}

       p = Pattern.compile("nombre");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Fernanda");
	if(sec==2)
      	System.out.println("Carolina");
	if(sec==3)
      	System.out.println("Jessica");
	if(sec==4)
      	System.out.println("Maria");
	if(sec==5)
      	System.out.println("Claudia");
	if(sec==6)
      	System.out.println("Monica");
	encontrado=true;
	}

       p = Pattern.compile("anos");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("22");
	if(sec==2)
      	System.out.println("10");
	if(sec==3)
      	System.out.println("30");
	if(sec==4)
      	System.out.println("12");
	if(sec==5)
      	System.out.println("20");
	if(sec==6)
      	System.out.println("8");
	encontrado=true;
	}

       p = Pattern.compile("dira");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Lo que quieras escuchar");
	if(sec==2)
      	System.out.println("Si");
	if(sec==3)
      	System.out.println("No");
	if(sec==4)
      	System.out.println("No se lo que te va a decir...");
	if(sec==5)
      	System.out.println("No creo que quieras saber...");
	if(sec==6)
      	System.out.println("Tal vez ...");
	encontrado=true;
	}


       p = Pattern.compile("re ");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Una lana en la disquetera y ya veremos ...");
	if(sec==2)
      	System.out.println("Encomiendate a san cristobal y asi sera...");
	if(sec==3)
      	System.out.println("Empieza por mejorar tu imagen si deseas que sea verdad.");
	if(sec==4)
      	System.out.println("Si lo deseas con el corazon...");
	if(sec==5)
      	System.out.println("No lo creo...");
	if(sec==6)
      	System.out.println("Definitivamente no");
	encontrado=true;
	}

       p = Pattern.compile("me ");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Solo si hay luna llena");
	if(sec==2)
      	System.out.println("Solo si tu esfuerzo es constante");
	if(sec==3)
      	System.out.println("Si");
	if(sec==4)
      	System.out.println("No");
	if(sec==5)
      	System.out.println("No lo dudo");
	if(sec==6)
      	System.out.println("No veo claro eso");
	encontrado=true;
	}

       p = Pattern.compile("ra");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Lo mas seguro es que si");
	if(sec==2)
      	System.out.println("Tal vez");
	if(sec==3)
      	System.out.println("Eso no depende de ti");
	if(sec==4)
      	System.out.println("si");
	if(sec==5)
      	System.out.println("no");
	if(sec==6)
      	System.out.println("Lo mas probable es que no");
	encontrado=true;
	}

       p = Pattern.compile("soy");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Solo si tu asi lo crees");
	if(sec==2)
      	System.out.println("todo lo contrario");
	if(sec==3)
      	System.out.println("si");
	if(sec==4)
      	System.out.println("no");
	if(sec==5)
      	System.out.println("Eso solo Ala lo sabe");
	if(sec==6)
      	System.out.println("preguntaselo a tu madre ...");
	encontrado=true;
	}

       p = Pattern.compile("es ");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Solo si tu asi lo crees");
	if(sec==2)
      	System.out.println("todo lo contrario");
	if(sec==3)
      	System.out.println("si");
	if(sec==4)
      	System.out.println("no");
	if(sec==5)
      	System.out.println("Eso solo Ala lo sabe");
	if(sec==6)
      	System.out.println("preguntaselo a tu madre ...");
	encontrado=true;
	}

       p = Pattern.compile("eres");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Solo si tu asi lo crees");
	if(sec==2)
      	System.out.println("todo lo contrario");
	if(sec==3)
      	System.out.println("si");
	if(sec==4)
      	System.out.println("no");
	if(sec==5)
      	System.out.println("Eso solo Ala lo sabe");
	if(sec==6)
      	System.out.println("preguntaselo a tu madre ...");
	encontrado=true;
	}


       p = Pattern.compile("quien");
       m = p.matcher(input);
      if ((m.find()) && (encontrado==false))
      {
      
	if(sec==1)
      	System.out.println("Alguien tan cercano que no lo creerias");
	if(sec==2)
      	System.out.println("Tu mejor amigo");
	if(sec==3)
      	System.out.println("Quien menos lo esperas");
	if(sec==4)
      	System.out.println("Quien tu esperas");
	if(sec==5)
      	System.out.println("Un compañero de trabajo, ya sabes quien");
	if(sec==6)
      	System.out.println("No me pregustes, ya lo sabes.");
	encontrado=true;
	}


	
	if (encontrado==false)
	{
	if(sec==1)
      	System.out.println("Ni los astros pueden predecir tal cosa!!!");
	if(sec==2)
      	System.out.println("No lo se");
	if(sec==3)
      	System.out.println("Lo mejor es que no te conteste eso...");
	if(sec==4)
      	System.out.println("No creo que quieras saber");
	if(sec==5)
      	System.out.println("Ya me estoy molestando, pregunta otra cosa");
	if(sec==6)
      	System.out.println("Se ve nublado tu destino...");
	encontrado=true;
	}
	if (sec==6)
	{
	sec = 0;
	}


      encontrado=false;


	}


    


 



   }
}


