/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author heber
 */
public class Motor {
    private String tipo;
    private String numeroDeSerie;
    
    public Motor (String tipo, String numeroDeSerie){
        this.tipo=tipo;
        this.numeroDeSerie=numeroDeSerie;
    }
    @Override
    public String toString(){
        return "Tipo de motor: "+this.tipo+" numero de motor: "+this.numeroDeSerie;
    }
}

