
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Ejercicio11 {
    public static final double descuento=0.10;
    public double calcularDescuentoEspecial(double precio){
        double descuentoAplicado=descuento;
        double precioFinal = precio -(precio*descuentoAplicado); 
        return precioFinal;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto ");
        double precioProducto=scan.nextDouble();
        System.out.println("\nEl descuento especial aplicado es: "+descuento );
        Ejercicio11 calculo=new Ejercicio11();
        double precioFinal=calculo.calcularDescuentoEspecial(precioProducto);
        System.out.println("El precio final con descuento es "+ precioFinal);
    }
}
      
    
