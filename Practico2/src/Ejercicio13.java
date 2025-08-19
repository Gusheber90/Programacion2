
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Ejercicio13 {
    public static void array(double[]arr,int indice){
        if (indice>=arr.length){
            return;
        } else {
        }
        System.out.println(arr[indice]);
        array(arr,indice+1);
    }
    public static void main(String[] args) {
        
        Scanner scan= new Scanner (System.in);
        double []precios;
        precios=new double[5];
        precios[0]=199.99;
        precios[1]=299.5;
        precios[2]=149.75;
        precios[3]=399.0;
        precios[4]=89.99;
        
        System.out.println("Precio de los productos\n");
        array(precios,0);
        
        System.out.println("\nIngrese el indice del producto que desea reemplazar su valor");
        int indice= scan.nextInt();
        scan.nextLine();
        System.out.println("\nIngrese el nuevo valor del producto");
        double nuevoValor=scan.nextDouble();
        precios[indice]=nuevoValor;
        
        System.out.println("\nNueva lista de valores");
        array(precios,0);
        
                
    }

   
    
}
