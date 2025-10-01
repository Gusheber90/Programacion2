package Ejercicio1;


import Ejercicio1.Foto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(int numero, String fechaEmision, String foto, String formato){
       this.numero=numero;
       this.fechaEmision=fechaEmision;
       this.foto =new Foto (foto, formato);
        
    }

    public int getNumero() {
        return numero;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte()!=this){
        titular.setPasaporte(this);
        }
    }
    public void mostrarPasaporte(){
        System.out.println("\nN° de pasaporte: "+numero+
                           "\nFecha de emision: "+fechaEmision+
                           "\nFoto :"+foto.getImagen()+
                           "\nNombre: "+titular.getNombre()+
                           "\nDNI: "+titular.getDni());
}
}    
