package Puntos;

public class Punto1 
{
	public static void main(String[] args)
	{
		String codigo = args[0];
		char[] arr = codigo.toCharArray(); 
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == '0')
				arr[i] = 'S';
			else if(arr[i] == '1')
				arr[i] = 'U';
			else if(arr[i] == '2')
				arr[i] = 'T';
			else if(arr[i] == '3')
				arr[i] = 'P';
			else if(arr[i] == '4')
				arr[i] = 'A';
			else if(arr[i] == '5')
				arr[i] = 'G';
			else if(arr[i] == '6')
				arr[i] = 'M';
			else if(arr[i] == '7')
				arr[i] = 'E';
			else if(arr[i] == '8')
				arr[i] = 'L';
			else
				arr[i] = 'C';
		}
		System.out.println(new String(arr)); 
	}
}

