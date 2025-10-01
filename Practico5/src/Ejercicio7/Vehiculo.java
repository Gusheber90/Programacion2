/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author heber
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;

    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente=patente;
        this.modelo=modelo;
        this.motor=motor;
    }
    public Conductor getConductor() {
        return conductor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() !=this){
        conductor.setVehiculo(this);
        }
    }
    
    public void mostrarVehiculo(){
        System.out.println("\nPatente: "+patente+
                           "\nModelo: "+ modelo+
                           "\nPatente: "+patente+
                           "\nConuctor: "+conductor.getNombre()+
                           "\nLicencia: "+conductor.getLicencia()+
                           "\nMotor: "+motor);
        
    }    
    
}