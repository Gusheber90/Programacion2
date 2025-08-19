<<<<<<< HEAD

import java.util.Scanner;

=======
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
<<<<<<< HEAD

public class Ejercicio10 {
    public int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
              
        int Nstock=stockActual-cantidadVendida+cantidadRecibida;
        return Nstock;
        
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el stock actual");
        int StockIng= scan.nextInt();
        System.out.println("\nIngrese las cantidades vendidas");
        int cantVendida=scan.nextInt();
        System.out.println("\nIngrese las cantidades recibidas");
        int cantRecibida=scan.nextInt();
        
         Ejercicio10 calculo=new Ejercicio10();
         int stockActual = calculo.actualizarStock(StockIng, cantVendida, cantRecibida);
        
         System.out.println("La cantidad en stock es "+ stockActual);
        
    }
}
=======
public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }

}
/* Linea     a         b       resultado
     11   SIN DEF.  SIN DEF.    SIN DEF.
     12      5      SIN DEF.    SIN DEF.
     13      5         2        SIN DEF.
     14      5         2           2
     15      5         2           2
     
*/
    
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
