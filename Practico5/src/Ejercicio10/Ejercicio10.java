/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import Utilidades.Menu;

/**
 *
 * @author heber
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Patricia Sosa", 32865390);
        CuentaBancaria cuentaBancaria = new CuentaBancaria ("29340567218341225",3450123, 347629,"14/02/2025");
        
        cuentaBancaria.setTitular(titular);
        titular.setCuentaBancaria(cuentaBancaria);
        
        String[] opciones={"Mostrar Titular", "Mostrar Cuenta Bancaria"};
        Runnable[] acciones = {
                () -> {titular.mostrarTitular();
                },
                () -> {cuentaBancaria.mostrarCuenta();
                },
        };
        
        Menu.menuDesplegado(opciones, acciones); 

    }

}
