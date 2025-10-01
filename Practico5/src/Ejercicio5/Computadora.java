/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author heber
 */
public class Computadora {
    private String marca;
    private String numeroDeSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(String marca, String numeroDeSerie,String nombrePlaca, String modeloPlaca){
    this.marca=marca;
    this.numeroDeSerie=numeroDeSerie;
    this.placaMadre= new PlacaMadre(nombrePlaca, modeloPlaca);
    }
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario=propietario;
        if(propietario!=null && propietario.getComputadora()!= this){
        propietario.setComputadora(this);
            
        }

    }
    public void mostrarComputadora(){
        System.out.println ("\nMarca: "+marca+
                           "\nN° de Serie "+numeroDeSerie+
                           "\nModelo de Motherboard: "+placaMadre+
                           "\nPropietario " +this.propietario.getNombre());
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }
   
}

  

