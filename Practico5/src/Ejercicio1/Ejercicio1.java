package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import Utilidades.Menu;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        Titular titular = new Titular(23654238,"Diego Perez");
        Pasaporte pasaporte= new Pasaporte(12938412,"14/08/2023","Pelado canoso",".png");
       
        pasaporte.setTitular(titular);
        titular.setPasaporte(pasaporte);
              
        
        
                
 
    
        String[] opciones={"Mostrar Pasaporte", "Mostrar Titular"};
        Runnable[] acciones = {
                () -> {pasaporte.mostrarPasaporte();
                },
                () -> {titular.mostrarTitular();
                }
            };
        
        Menu.menuDesplegado(opciones, acciones);
}
}    