/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author heber
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente paciente =new Paciente("Maria Gonzalez", "Galeno");
        Profesional profesional = new Profesional ("Sara Pere", "Dermatología");
        CitaMedica citaMedica=new CitaMedica("30/09/2025", "15:40");
    
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
    
        citaMedica.mostrarCitaMedica();
    }
    
}
