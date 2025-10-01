/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author heber
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva (String fecha, String hora, Mesa mesa){
        this.fecha=fecha;
        this.hora=hora;
        this.mesa=mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void mostrarCliente(){
    if (cliente!= null){
        System.out.println("\n"+cliente.getNombre()+" tiene una reserva para las "+ hora+ " el dia "+fecha+ " en mesa " +mesa.getNumero()+ "con capacidad para " +mesa.getCapacidad()+ " personas");
    }}
}
