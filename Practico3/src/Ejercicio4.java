
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
class Gallina{
    int idGallina;
    int edad;
    int huevosPuestos;

  

}


public class Ejercicio4  {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random rand = new Random();    
                System.out.println("Desea crear una gallina? S/N");
                String opcion=scan.nextLine();
                opcion= opcion.toUpperCase();  
                System.out.println("Cuantas gallinas desea crear? ");
                int cantidad=scan.nextInt();
                scan.nextLine();
       
            if (opcion.equals("S")){
                Gallina[] gallina = new Gallina[cantidad];
                
                for (int i = 0; i<cantidad; i++){
                   gallina[i]=new Gallina();
                    System.out.println("\ningrese la edad de la gallina"+(i+1)+": ");
                    gallina[i].edad =scan.nextInt();
                    
                    gallina[i].idGallina = 100 + rand.nextInt(5000);
                    
                    
                  
                }    
                for (int i=0; i<cantidad; i++){
                    System.out.println("Gallina "+ (i+1)+ ": ID: "+gallina[i].idGallina) ;}
                    
            String[] opciones={"Mostrar estado de la Galiina", "Hacer poner huevos", "Envejecer gallina"};
            
            Runnable[] acciones = {
            () -> {
                    System.out.println("\nEstado de todas las gallinas:");
                        for (int i = 0; i < cantidad; i++) {
                         Metodos.mostrarEstado(gallina[i]);
                    }
                },      
            () -> {
                    
                    System.out.print("\nIngrese el ID de la gallina que pondrá huevos: ");
                    int idBuscado = scan.nextInt();
                    scan.nextLine();
                    
                    Gallina seleccionada = null;
                    for (int i = 0; i < cantidad; i++) {
                        if (gallina[i].idGallina == idBuscado) {
                            seleccionada = gallina[i];
                            
                            break;
                        }
                    }

                    if (seleccionada != null) {
                        Metodos.ponerHuevo(seleccionada, 0); 
                    } else {
                        System.out.println("No se encontró una gallina con ese ID.");
                    }
                    Metodos.mostrarEstado(seleccionada);
                    
               },
            ()  ->{
                    System.out.print("\nIngrese el ID de la gallina que vamos a envejecer: ");
                    int idBuscado = scan.nextInt();
                    scan.nextLine();
                    
                    Gallina seleccionada = null;
                    for (int i = 0; i < cantidad; i++) {
                        if (gallina[i].idGallina == idBuscado) {
                            seleccionada = gallina[i];
                            
                            break;
                        }
                    }

                    if (seleccionada != null) {
                        Metodos.envejecer(seleccionada, 0); 
                    } else {
                        System.out.println("No se encontró una gallina con ese ID.");
                    }
                    Metodos.mostrarEstado(seleccionada);
            
            }        
         
            
           
            
    };
   Metodos.menuDesplegado(opciones, acciones); 
}
}  
}
