/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
<<<<<<< HEAD
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int contadorPos=0;
    int contadorNeg=0;
    int contador=0;
    
   for (int i=0; i<10; i++){
    System.out.println("Por favor ingrese un número");
    int n=scan.nextInt();
    if (n<0){
        contadorPos=contadorNeg+1;
    }
    if (n>0){
        contadorNeg=contadorPos+1;
    }
    if (n==0){
        contador=contador+1;
    }
   }
        System.out.println("\n De los números ingresados:\n"
                            +contadorPos+" son positivos\n"
                            +contadorNeg+" son negativos\n"
                            +"el cero aparece "+contador);
}
=======
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Nombre : Juan Pérez \n"+
                           "Edad: 30 años \n"+
                           "Direccion: \"Calle Falsa 123\"");
        
    }
    
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
}
