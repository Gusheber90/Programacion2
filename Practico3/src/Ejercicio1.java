
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificación;
    
    double getCalificacion(){
        return calificación;
    }
    void setCalificacion(double calificacion){
        this.calificación=calificacion;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner scan= new Scanner (System.in);   
        
        
        Estudiante alumno = new Estudiante();
        alumno.nombre="Juan";
        alumno.apellido="Ibañez";
        alumno.curso="5to B";
        alumno.calificación=8;
    
        String[] opciones={"Mostrar info. Estudiante", "Aumentar nota", "Disminuir nota"};
         
    
        Runnable[] acciones = {
    () -> Metodos.mostrarInfo(alumno),
    () -> {
        System.out.println("\nIngrese puntos a subir: ");
        double puntos = scan.nextDouble();
        Metodos.subirCalificacion(alumno, puntos); 
        System.out.println("Nueva calificación: " + alumno.calificación);
    },
    () -> {
        System.out.print("Ingrese puntos a bajar: ");
        double puntos = scan.nextDouble();
        Metodos.bajarCalificacion(alumno, puntos); 
        System.out.println("Nueva calificación: " + alumno.calificación);
    }
};
   Metodos.menuDesplegado(opciones, acciones); 

    }
        
}

    
   

