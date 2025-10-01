/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author heber
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Martín Hidalgo", "20-45632895-6");
        Impuesto impuesto =new Impuesto (13456.47);
        impuesto.setContribuyente(contribuyente);
        
        Calculadora calculadora = new Calculadora ();
        calculadora.calcular(impuesto);
    }
    
}
