import java.awt.*;

public class prueba_grafico extends Frame
{
	prueba_grafico()
	{
		super();
	}
	
	public prueba_grafico(String titulo)
	{
		super(titulo);
		int ancho = 800;
		int alto = 570;
		this.setSize(ancho, alto);
		this.setVisible(true);
	}
	
	public static void main(String arg[])
	{
	 	prueba_grafico frame = new prueba_grafico("Hola que mas");
	}
}