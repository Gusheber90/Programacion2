/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author heber
 */
public class Proyecto {
    private String nombre;
    private String duracionMin;
   
    public Proyecto (String nombre, String duracion){
        this.nombre=nombre;
        this.duracionMin=duracion;
    }

@Override
    public String toString(){
        return "\nNombre del proyecto: "+nombre+ "\nDuracion: "+duracionMin;
    }
}
