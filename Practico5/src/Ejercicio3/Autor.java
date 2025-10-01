/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author heber
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    private Libro libro;
   
    
    public Autor(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString(){
        return "\nNombre: "+ nombre+
               "\nNacionalidad "+nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
