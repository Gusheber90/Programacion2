/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author heber
 */
public class PlacaMadre {
    private String nombre;
    private String chipset; 
    
    public PlacaMadre(String nombre,String chipset){
        this.nombre=nombre;
        this.chipset=chipset;
    }
    @Override
    public String toString() {
    return this.nombre + " " + this.chipset; 
    }
}
