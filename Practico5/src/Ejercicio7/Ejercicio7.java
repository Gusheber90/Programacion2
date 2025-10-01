/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import Utilidades.Menu;

/**
 *
 * @author heber
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor= new Motor("1.4L", "9W87KRL2465");
        Vehiculo nuevoVehiculo= new Vehiculo("AD756TH", "CHEVROLET ONIX",motor);
        Conductor conductor =new Conductor ("Francisco Lopez", 29456893);
        nuevoVehiculo.setConductor(conductor);
        conductor.setVehiculo(nuevoVehiculo);
        
        String[] opciones={"Mostrar Vehiculo", "Mostrar Conductor"};
        Runnable[] acciones = {
                () -> {nuevoVehiculo.mostrarVehiculo();
                },
                () -> {conductor.mostrarConductor();
                },
        };
        
        Menu.menuDesplegado(opciones, acciones);
    }
    
}
