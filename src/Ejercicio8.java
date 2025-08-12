/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
       
        int n1=lector.nextInt();
        int n2=lector.nextInt();
        int division= n1/n2;
        System.out.println(division);
        /*Al dividir numeros alojados en variables enteras, el resultado siempre es el valor entero de la division*/
        
        double num1= (double) n1;
        double num2=(double) n2;
        double div= num1/num2;
        System.out.println(div);
        /* En cambio al convertir los valores a double, arroja el valor con decimales en la division */
        
    }
    
}
