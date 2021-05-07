   import java.io.*;

class gato
{
	public static void main(String [] args)
	{
	int m=0 ,n=0 ,ch2=1;

	char matrix[][];//={0};
	matrix = new char[3][3];


while(ch2==1)
{
for (m=0;m<3;m++)for (n=0;n<3;n++)matrix[m][n]= '\0';
int i,j,sum=0;

while ( sum < 10)
{
if (sum == 0) 
{
System.out.println (" ");
System.out.println ("                 1   2   3");
System.out.println ("              1  "+matrix[0][0]+" | "+matrix[0][1]+" | "+matrix[0][2]);
System.out.println ("                ---|---|---");
System.out.println ("              2  "+matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]);
System.out.println ("                ---|---|---");
System.out.println ("              3  "+matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]);
}
System.out.println ("Jugador 1 es 'X': selecciona renglon y columna");
System.out.print ("Renglon : ");
i = Leer.datoint();
System.out.print("Columna : ");
j = Leer.datoint();
for (;i>3 || i<1 || j>3 || j<1 ||('X'==matrix[i-1][j-1]||'O'==matrix[i-1][j-1]);) {System.out.println ("Lo siento, escoge otro renglon y columna.");
System.out.print ("Renglon : ");
i=Leer.datoint();
System.out.print ("columna : ");
j=Leer.datoint();}

matrix[i-1][j-1]='X';
sum++;
{
System.out.println (" ");
System.out.println ("                 1   2   3");
System.out.println ("              1  "+matrix[0][0]+" | "+matrix[0][1]+" | "+matrix[0][2]);
System.out.println ("                ---|---|---");
System.out.println ("              2  "+matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]);
System.out.println ("                ---|---|---");
System.out.println ("              3  "+matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]);
}
if (matrix[0][0]=='X' && matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[2][0]=='X' && matrix[2][0]==matrix[1][1] && matrix[1][1]==matrix[0][2]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[0][0]=='X' && matrix[0][0]==matrix[1][0] && matrix[1][0]==matrix[2][0]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[0][1]=='X' && matrix[0][1]==matrix[1][1] && matrix[1][1]==matrix[2][1]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[0][2]=='X' && matrix[0][2]==matrix[1][2] && matrix[1][2]==matrix[2][2])
 {System.out.println ("Jugador 1 gana");break;}
if (matrix[0][0]=='X' && matrix[0][0]==matrix[0][1] && matrix[0][1]==matrix[0][2]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[1][0]=='X' && matrix[1][0]==matrix[1][1] && matrix[1][1]==matrix[1][2]) 
{System.out.println ("Jugador 1 gana");break;}
if (matrix[2][0]=='X' && matrix[2][0]==matrix[2][1] && matrix[2][1]==matrix[2][2])
{System.out.println ("Jugador 1 gana");break;}
if (sum == 9){
System.out.println ("Nadie gana..."); break;}



//Turno del jugador 2

System.out.println ("Jugador 2 es 'O': selecciona renglon y columna");
System.out.print ("Renglon : ");
i = Leer.datoint();
System.out.print ("Columna : ");
j = Leer.datoint();

for (;i>3 || i<1 || j>3 || j<1 ||('X'==matrix[i-1][j-1]||'O'==matrix[i-1][j-1]);) 
{System.out.println ("Debes escoger otra posicion");
System.out.print ("Renglon : ");
i = Leer.datoint();
System.out.print ("Columna : ");
j = Leer.datoint();}

matrix[i-1][j-1]='O';
sum++;
{
System.out.println (" ");
System.out.println ("                 1   2   3");
System.out.println ("              1  "+matrix[0][0]+" | "+matrix[0][1]+" | "+matrix[0][2]);
System.out.println ("                ---|---|---");
System.out.println ("              2  "+matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]);
System.out.println ("                ---|---|---");
System.out.println ("              3  "+matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]);
}



if (matrix[0][0]=='O' && matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]) {System.out.println ("Jugador 2 gana");break;}
if (matrix[2][0]=='O' && matrix[2][0]==matrix[1][1] && matrix[1][1]==matrix[0][2]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[0][0]=='O' && matrix[0][0]==matrix[1][0] && matrix[1][0]==matrix[2][0]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[0][1]=='O' && matrix[0][1]==matrix[1][1] && matrix[1][1]==matrix[2][1]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[0][2]=='O' && matrix[0][2]==matrix[1][2] && matrix[1][2]==matrix[2][2]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[0][0]=='O' && matrix[0][0]==matrix[0][1] && matrix[0][1]==matrix[0][2]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[1][0]=='O' && matrix[1][0]==matrix[1][1] && matrix[1][1]==matrix[1][2]) 
{System.out.println ("Jugador 2 gana");break;}
if (matrix[2][0]=='O' && matrix[2][0]==matrix[2][1] && matrix[2][1]==matrix[2][2]) 
{System.out.println ("Jugador 2 gana");break;}

}

System.out.println (" ");
System.out.println ("Desea jugar otra vez??? 1=si 2=no");
ch2 = Leer.datoint();



}
}
}
