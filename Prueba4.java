package prueba.pkg4;
import javax.swing.*;
import java.io.*;

public class Prueba4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {       
        Prueba4 objeto = new Prueba4();//Objeto de clase 
        //llamado de metodo escribirMes que capta dos datos tipo String
        objeto.escribirMes(JOptionPane.showInputDialog(null,"Ingrese un numero correspondiente a un mes del año: "), JOptionPane.showInputDialog(null,"Ingrese una letra correspondiente a un Dia de la semana: "));
    }
    
    public void escribirMes (String NumMes, String Dia) throws IOException{ 
        String ruta; //variable que contiene la ruta de destino del archivo .txt
        ruta=JOptionPane.showInputDialog(null,"Ingrese la ruta donde desea guardar el archivo:( Ej: C:/ )");
        String nombre="Mes"+NumMes+".txt"; //Nombre del archivo que se generara en cada ejecución.
        BufferedWriter bw; //Variable utilizada para trabajar sobre el archivo 
        File archivo=new File(ruta+nombre); //Creacion de archivo de texto.
        String semanamayus[]={"L","M","X","J","V","S","D"};//Arreglo con los dias de la semana en Mayusculas
        String semanaminus[]={"l","m","x","j","v","s","d"};//Arreglo con los dias de la semana en minusculas
        String calendario="";//Variable utilizada para almacenar la informacion que llevara el archivo .txt
        int indexdia=0;//Variable utilizada para ubicar el dia de la semana ingresado.
        int diasdelmes=0;//Variable utilizada para almacenar el numero de dias correspondientes al mes ingresado.
        //Si los meses tienen 31 dias:
        for(int j=0;j<7;j++){
            //ubica el dia de la semana ingresado por el usuario en el arreglo que contiente los dias de las semana en MAYUS y minus     
            if(semanamayus[j].equals(Dia)||semanaminus[j].equals(Dia)){ indexdia=j;}
            }
        if(Integer.parseInt(NumMes)== 1 || Integer.parseInt(NumMes)== 3 || Integer.parseInt(NumMes)== 5 || Integer.parseInt(NumMes)== 7 || Integer.parseInt(NumMes)== 8 || Integer.parseInt(NumMes)== 10 || Integer.parseInt(NumMes)== 12){       
            diasdelmes=31;                      
        }
        //Si los meses tienen 30
        else if(Integer.parseInt(NumMes)== 4 || Integer.parseInt(NumMes)== 6 || Integer.parseInt(NumMes)== 9 || Integer.parseInt(NumMes)== 11 ){
            diasdelmes=30;  
        }
        // Si el mes es febrero
        else if(Integer.parseInt(NumMes)== 2){
            diasdelmes=28;
        }                  
        for(int i=1;i<=diasdelmes;i++){
          
              calendario+=i+semanamayus[indexdia]+" "; 
              
               if(semanamayus[indexdia].equals("D")){//si el dia es igual a Domingo reinicia el arreglo semanamayus
                    indexdia=0;
                }else{indexdia++;}
            }       
      bw = new BufferedWriter(new FileWriter(archivo));
      bw.write(calendario);
      bw.close();
      JOptionPane.showMessageDialog(null,"Archivo de texto generado" );
    } 
}
