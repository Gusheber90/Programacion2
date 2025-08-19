/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
public class Ejercicio9 {
<<<<<<< HEAD
    
    public double calcularCostoEnvio(double peso, String zona){
        double costoEnvio=0;
        double envioNacional=5;
        double envioInternacional=10;
               
        switch (zona){
            case "nacional":
                costoEnvio=peso*envioNacional;
                break;
            case "internacional":
                costoEnvio=peso*envioInternacional;
                break;
        }
        return costoEnvio;
        
        
}
    public double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioFinal = precioProducto+costoEnvio;
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double valor=scan.nextDouble();
        System.out.println("\nIngrese el peso del bulto en kg");
        double peso=scan.nextDouble();
        scan.nextLine();
        
        System.out.println("\nIngrese si es un envío Nacional o Internacional");
        String destino=scan.nextLine().toLowerCase();
        
        Ejercicio9 calculo=new Ejercicio9();
        Double precioEnvio=calculo.calcularCostoEnvio(peso, destino);
        double precioFinal=calculo.calcularTotalCompra(valor,precioEnvio);
        System.out.println("\nEl precio final del producto es "+precioFinal);
    }

}

=======
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextInt(); // ERROR
    System.out.println("Hola, " + nombre);
    }
}
/*El error es que define la variable "nombre" como de tipo cadena, pero intenta asignarle un valor entero ingresado por el usuario */
>>>>>>> 3610a0eda945eee55a519161ae2664f46c2174e7
