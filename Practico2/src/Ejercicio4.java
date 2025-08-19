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

public class Ejercicio4 {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        
        double precioDes= 0;
        double descuento= 0;
        boolean opcion= true;
                
        
        do{ 
            System.out.println("Por favor ingrese el precio de un producto");
            double precio= scan.nextDouble();
            
            System.out.println("Ingrese la categoría del producto\n" + "A, B o C");
            char categoria= scan.next().charAt(0);
            categoria=Character.toUpperCase(categoria);
            switch(categoria){
                case 'A':
                    descuento=precio*0.10;
                    precioDes=precio-descuento;
                    break;
            
                case 'B':
                    descuento=precio*0.15;
                    precioDes=precio-descuento;
                    break;    
                case 'C':
                    descuento=precio*0.20;
                    precioDes=precio-descuento;
                    break;
        }
            System.out.println("------RESUMEN------\n" 
                        + "Precio original del producto " + precio +"\n" 
                        + "Descuento aplicado "+ descuento +"\n" 
                        + "Precio final " +precioDes);
            System.out.println("\nDesea analizar otro producto S/N");
            char op=scan.next().charAt(0);
            op=Character.toUpperCase(op);
            if (op=='N'){
                opcion =false;
            }
        }while(opcion == true);
    }
    
    
=======
import  java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Por favor ingrese su nombre");
        String name = lector.nextLine();
        System.out.println("Ahora ingrese su edad");
        int edad = lector.nextInt();
        
        System.out.println("Un gusto " + name + ", asi que tenes " + edad + " años");
    }
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
}
