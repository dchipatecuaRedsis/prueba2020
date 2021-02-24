package prueba.pkg2;

public class Prueba2 {
    
    public static void main(String[] args) {
       int a,b,c; //variables enteras utilizadas para realizar el calculo de la tripleta pitagorica
       
        for(a=1;a<=333;a++){
            for(b=334;b<=999;b++){
                c=1000-a-b;
                    if(Math.pow(a,2)+ Math.pow(b,2)== Math.pow(c,2) && a<b){//Condicion que define la unica tripleta pitagorica que sumada da 1000
                    System.out.println("Los numeros que correspone a la tripleta pitagorica que sumados dan como resultado 1000 son: " + a +" + "+ b +" + " + c);//mensaje con el resultado                   
                }
            }
        }
    }  
}
