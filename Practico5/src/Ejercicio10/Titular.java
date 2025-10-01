/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author heber
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;
    
    public Titular(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarTitular(){
        System.out.println("\nTitular: " +nombre+
                           "\nDNI: " +dni+
                           "\nCBU: "+cuentaBancaria.getCbu()+
                           "\nSaldo disponible: "+cuentaBancaria.getSaldo());
    }
}
