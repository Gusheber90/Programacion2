/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import Utilidades.Menu;
import java.util.HashSet;
import java.util.Set;

import Utilidades.Menu;
import java.util.Scanner;

/**
 *
 * @author heber
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        Computadora computadora = new Computadora ("Samsung", "97253912412","B-450", "AMD4");
        Propietario propietario = new Propietario ("Gustavo Silva",35077433);
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);
        
        Computadora compuGonza = new Computadora ("Lenovo", "219412739012", "B550", "Ryzen4");
        Propietario gonzalo = new Propietario ("Gonzalo Barrios", 33789543);
        compuGonza.setPropietario(gonzalo);
        gonzalo.setComputadora(compuGonza);
                
        
        String[] opciones={"Mostrar Computadora", "Mostrar Propietario"};
        Runnable[] acciones = {
                () -> { 
                       String[] opcionMenu2={"Computadora 1", "Computadora 2"};
                       Runnable[] acciones2 = {
                           
                       ()->{computadora.mostrarComputadora();},
                       () ->{compuGonza.mostrarComputadora();}};
                       Menu.menuDesplegado(opcionMenu2, acciones2);
                      },
                () -> {propietario.mostrarPropietario();
                       gonzalo.mostrarPropietario();
                },
        };
        
        Menu.menuDesplegado(opciones, acciones); 
    }
    
}
