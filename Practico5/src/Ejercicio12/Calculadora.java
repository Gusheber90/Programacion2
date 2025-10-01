/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author heber
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.println("\nNombre contribuyente: "+impuesto.getContribuyente().getNombre()+
                           "\nCUIL: "+impuesto.getContribuyente().getCuil()+
                           "\nMonto: "+impuesto.getMonto());
    }
    
}
