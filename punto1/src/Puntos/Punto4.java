package Puntos;

import java.io.FileWriter;
import java.io.IOException;

public class Punto4 
{
	public static void main (String[] args) throws IOException
	{
		int mes = Integer.valueOf(args[0]); 
		char dia = args[1].toCharArray()[0];
		int dias = 31;
		char[] semana = {'L','M','X','J','V','S','D'};
		if (mes == 2)
			dias = 28; 
		else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
			dias = 30;
		int diaIndx = 0;
		boolean found = false;
		while (!found)
		{
			if (semana[diaIndx] == dia)
				found = true; 
			else
				diaIndx++;
		}
		FileWriter writer = new FileWriter("resp.txt");
		for(int i = 1; i<=dias; i++)
		{
			writer.write(i+""+semana[diaIndx]);
			if (diaIndx == semana.length-1)
				diaIndx = 0;
			else
				diaIndx++; 
		}
		writer.close();				
	}
}
