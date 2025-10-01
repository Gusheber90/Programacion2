/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author heber
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;
    
    public CuentaBancaria(String cbu, double saldo, int codigo, String modificacion){
        this.cbu=cbu;
        this.saldo=saldo;
        this.claveSeguridad =  new ClaveSeguridad (codigo, modificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null  && titular.getCuentaBancaria() !=this){
            titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
    public void mostrarCuenta(){
        System.out.println("\nTitular: " +titular.getNombre()+
                           "\nCBU: " +cbu+
                           "\nSaldo: "+saldo+
                           "\nCodigo: "+claveSeguridad.getCodigo()+
                           "\nUltimaModificacion: "+claveSeguridad.getUltimaModificacion());
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
