/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author heber
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente nuevoCliente= new Cliente ("Juan Carlos Hernandez", 1148952312);
        Mesa mesa = new Mesa(9, 4);
       
        Reserva nuevaReserva = new Reserva ("27/09/2025", "21:00 hrs",mesa);
        nuevaReserva.setCliente(nuevoCliente);
        
        nuevaReserva.mostrarCliente();
        
    
    }
    
}
