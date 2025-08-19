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
<<<<<<< HEAD
    
    public double calcularPrecioFinal(double precio, double impuesto, double descuento){
        impuesto=impuesto/100;
        descuento=descuento/100;
        double precioFinal = (precio+(precio*impuesto))-(precio*descuento);
        return precioFinal;
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto");
        double precio = scan.nextDouble();
        System.out.println("\nIngrese el impuesto en porcentaje (Ejemplo 10 para 10%)");
        double imp=scan.nextDouble();
        System.out.println("\nIngrese el descuento en porcentaje (Ejemplo 5 para 5%)");
        double des=scan.nextDouble();
        
        Ejercicio8 calculo=new Ejercicio8();
        double precioFinal = calculo.calcularPrecioFinal(precio,imp,des);
        
        System.out.println("\nEl precio final del producto es "+precioFinal );
=======
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
        
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
    }
    
}
