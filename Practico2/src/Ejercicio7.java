/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
<<<<<<< HEAD
 */
import java.util.Scanner;
@SuppressWarnings("empty-statement")
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
     do{   
         System.out.println("\nPor favor ingrese una nota entre 0 y 10");
         nota=scan.nextInt();
         if (nota>10 || nota<0){
             System.out.println("\nError: Nota invalida\n"
                                +"Ingrese una nota entre 0 y 10");    
         }
         
     
    }while (nota >10 || nota<0);
        System.out.println("Nota guardada correctamente");
}
=======
 * Una expresión es cualquier fragmento de código que genera un valor mientras que una instrucción es una acción que debe ejecutar Java la cual puede estar compuesta de expresiones.
 */ 
public class Ejercicio7 {
    public static void main(String[] args) {
        int x = 10; // "int" es una instrucción x=10 es una expresión
        x = x + 5; // "x+5" es una expresión "x=" Es una instrucción que indica que ahora el valor de x cambia por x+5
        System.out.println(x); // "System.out.println" es una instrucción, x es una expresión.
        
    }
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
}
