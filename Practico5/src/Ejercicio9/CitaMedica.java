/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author heber
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, String hora){
        this.fecha=fecha;
        this.hora=hora;
        
    }

    public void setPaciente(Paciente paciente) {
        if (paciente!=null){
        this.paciente = paciente;
    }else{System.out.println("No hay paciente asignado a la cita");
    }
    }    
    public void setProfesional(Profesional profesional) {
        if (profesional!=null){
        
        this.profesional = profesional;
    }else{System.out.println("No hay profesional asignado al turno");}
    }
    
    public void mostrarCitaMedica(){
        System.out.println("\nFecha: "+fecha+
                           "\nHora: "+hora+
                           "\nPaciente: " +paciente.getNombre()+
                           "\nCobertura: "+paciente.getObraSocial()+
                           "\nProfesional: "+profesional.getNombre()+
                           "\nEspecialidad: "+profesional.getEspecialidad());
    }
}
