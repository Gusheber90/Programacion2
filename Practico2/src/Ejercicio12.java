
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scan= new Scanner (System.in);
        double []precios;
        precios=new double[5];
        precios[0]=199.99;
        precios[1]=299.5;
        precios[2]=149.75;
        precios[3]=399.0;
        precios[4]=89.99;
        for (double precio:precios){
            System.out.println(precio);
        }
        
        
        System.out.println("\nDesea cambiar algun valor?\nIngrese S/N");
        String opcion = scan.nextLine();
        opcion=opcion.toUpperCase();
        while (!opcion.equals("N")){
            if (opcion.equals("S")){
               System.out.println("\nIngrese el indice del producto que desea reemplazar su valor");
               int indice= scan.nextInt();
               scan.nextLine();
               System.out.println("\nIngrese el nuevo valor del producto");
               double nuevoValor=scan.nextDouble();
               precios[indice]=nuevoValor;
               scan.nextLine();
            }
            else{
                System.out.println("Ingrese una opcion correcta");}
            
            System.out.println("\nDesea cambiar algun valor?\nIngrese S/N");
            opcion = scan.nextLine();
            opcion=opcion.toUpperCase();
               
            
        }
        
         for (double precio:precios){
            System.out.println("\n Nueva lista de valores "+precio);
            
        }
    }
}
    
    
    

