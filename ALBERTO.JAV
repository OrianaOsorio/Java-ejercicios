import java.io.*;

public class alberto
{

        public static void main (String[] args)
        {
		String pregunta = " ";
                try
                {
                   InputStreamReader isr = new InputStreamReader(System.in);
                   BufferedReader FlujoE = new BufferedReader(isr);
                   pregunta=FlujoE.readLine();
                }
                catch(IOException e)
                {
                   System.err.println("Errors:" + e.getMessage());
                }

		System.out.println(pregunta);
	}
}

