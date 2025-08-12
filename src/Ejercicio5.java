/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Por favor ingrese dos números enteros");
        double n1=lector.nextInt();
        double n2=lector.nextInt();
        
        double suma = n1+n2;
        double resta = n1-n2;
        double multiplicacion=n1*n2;
        double division =n1/n2;
        
        System.out.println( n1 + "+" + n2 + " = " + suma +"\n"+
                            n1 + "-" + n2 + " = " + resta + "\n"+
                            n1 + "x" + n2 + " = " + multiplicacion + "\n"+
                            n1 + "/" + n2 + " = " + division +"\n");
        
        
    }
    
}
