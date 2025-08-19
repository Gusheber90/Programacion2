/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
<<<<<<< HEAD

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int num;
        int sumPar= 0 ;
        do{
           System.out.println("Por favor ingrese un número o 0 para salir del programa");
           num = scan.nextInt();
           if (num % 2 == 0){
           sumPar = num+ sumPar;}
    } while (num !=0);
            System.out.println("La sumatoria de los números pares es " + sumPar);
    
}
}
=======
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
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
