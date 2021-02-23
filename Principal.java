package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		//Prueba 1
		Integer numero = 1234567890;
		String prueba = prueba1(numero);
		System.out.println(prueba);
		
		//Prueba 4
		escribirMes(3, 'M');
		
	}
	
	public static String prueba1(Integer numero){
		String cadena = Integer.toString(numero);
		String nuevaCadena;
		
		if(cadena.length() != 10){
			nuevaCadena = "El número debe tener 10 digitos";
		}
		else{
			 nuevaCadena = cadena
					.replace("0", "S")
					.replace("1", "U")
					.replace("2", "T")
					.replace("3", "P")
					.replace("4", "A")
					.replace("5", "G")
					.replace("6", "M")
					.replace("7", "E")
					.replace("8", "L")
					.replace("9", "C");
		}

		return nuevaCadena;
	}
	/**
	public static int prueba2(){
		int a,b,c;
		
		int raiz = (int) Math.sqrt(1000);
		
		for (int i = 1; i <= raiz; i++) {
			for (int j = i+1; j < raiz; j++) {
				 
			}
		}
		
	}
	**/
	
	public static void escribirMes(int mes, char primerDia){
		FileWriter fw = null;
		char diaSiguiente = primerDia;
		String nombre = "mes" + mes + ".txt";
				
		try{
			fw = new FileWriter(nombre);
			BufferedWriter bw = new BufferedWriter(fw);
			int dias = 31;
			
			for (int i = 1; i <= dias; i++) {
				
				switch (diaSiguiente) {
				case 'L':
					diaSiguiente = 'M';
					break;
				case 'M':
					diaSiguiente = 'X';
					break;
				case 'X':
					diaSiguiente = 'J';
					break;
				case 'J':
					diaSiguiente = 'V';
					break;
				case 'V':
					diaSiguiente = 'S';
					break;
				case 'S':
					diaSiguiente = 'D';
					break;
				case 'D':
					diaSiguiente = 'L';
					break;
				default:
					break;
				}

				bw.write(Integer.toString(i) + " " + Character.toString(diaSiguiente));
				bw.write("\n");
			}
			
			
			bw.close();
			System.out.println("Archivo creado");
			fw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	

}
