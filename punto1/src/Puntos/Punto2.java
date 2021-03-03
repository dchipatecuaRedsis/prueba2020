package Puntos;

public class Punto2 
{
	public static void main(String[] args)
	{
		boolean found = false;
		int a = 0;
		int b = 0; 
		int c = 1000; 
		for(int i = 0; !found; i++)
		{
			for(int j = 1; j <= i && !found; j++)
			{
				a = j;
				b = i-j; 
				c = 1000-i;
				if(((c > b) && (b > a) && (a*a)+(b*b) == (c*c)))
					found = true;
			}			
		}
		System.out.println("a="+a);		
		System.out.println("b="+b);	
		System.out.println("c="+c);	
	}

}
