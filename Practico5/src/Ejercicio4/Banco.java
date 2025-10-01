/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author heber
 */
public class Banco {
    private String nombre;
    private String cuit;
    
    public Banco(String nombre, String cuit){
        this.nombre=nombre;
        this.cuit=cuit;
    }

    public String getNombre() {
        return nombre;
    }
@Override
public String toString(){
    return "\nBanco Emisor: "+nombre+
           "\nCUIT: "+cuit;
}
}

