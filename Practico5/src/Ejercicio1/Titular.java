package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Titular {
    private int dni;
    private String nombre;
    private Pasaporte pasaporte;

    
    public Titular(int dni, String nombre){
    this.dni=dni;
    this.nombre=nombre;
}

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarTitular(){
        System.out.println("\nNombre: "+nombre+
                           "\nDNI: "+dni+
                           "\nN° de pasaporte: "+pasaporte.getNumero()+
                           "\nFoto: "+pasaporte.getFoto());
    }
    
       
    

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if (pasaporte!=null && pasaporte.getTitular() !=this){
            pasaporte.setTitular(this);}
    }

    
}    
