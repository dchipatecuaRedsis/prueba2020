package prueba.pkg1;
import javax.swing.*;

public class Prueba1 {

    public static void main(String[] args) {
        
        String dato;//variable receptora del numero ingresado
        Prueba1 convertir= new Prueba1(); //objeto de clase Prueba1
        dato= JOptionPane.showInputDialog(null,"Ingrese un numero de 10 digitos: ");
        try{
        convertir.convertirnumero(dato);}//llamado de metodo que convierte el numero en letras
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"El numero ingresado NO tiene una logitud de 10 digitos");
        }            
    }
    public void convertirnumero(String x)throws Exception{//metodo para convertir el numero captado
        int intcover;//variable entera utilizada para captar el numero a convertir
        String textcover =""; //variable String utilizada para captar la nueva cadena de caracteres de texto
        if(x.length()!=10){ //Verificación de excepcion (Solo acepta numero de 10 digitos)
            throw new Exception();        
    }
        else{
                
            for(int i=0;i<10;i++){
                intcover=Integer.parseInt(String.valueOf(x.charAt(i)));
                switch (intcover) {
                    case 0:
                        textcover+="S";
                        break;
                    case 1:
                        textcover+="U";
                        break;
                    case 2:
                        textcover+="T";
                        break;
                    case 3:
                        textcover+="P";
                        break;
                    case 4:
                        textcover+="A";
                        break;
                    case 5:
                        textcover+="G";
                        break;
                    case 6:
                        textcover+="M";
                        break;
                    case 7:
                        textcover+="E";
                        break;
                    case 8:
                        textcover+="L";
                        break;
                    case 9:
                        textcover+="C";
                        break;
                    default:
                        break;
                }
                }               
            }
            JOptionPane.showMessageDialog(null,"Conversión de numero a texto: \n"+ x + "\n" + textcover); //mensaje con el resultado de la conversión
        }      
    }
    

