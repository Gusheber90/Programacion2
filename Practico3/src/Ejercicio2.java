
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
class Mascota {
    String nombre;
    String especie;
    int edad;
    
}
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Desea crear una mascota? S/N");
        String opcion= scan.nextLine();
        opcion= opcion.toUpperCase();
        Mascota mascota= null;
        while (mascota == null && !opcion.equals("N")){ 
            if (opcion.equals("S")){
                mascota = new Mascota();
                final Mascota mascotaFinal =mascota;
                System.out.println("\nIngrese el nombre de su mascota");
                mascota.nombre= scan.nextLine();
                
                System.out.println("\nQue especie es su mascota?");
                mascota.especie= scan.nextLine();
                
                System.out.println("\nCual es la edad de la mascota?");
                mascota.edad= scan.nextInt();
                scan.nextLine(); //lo utilizo solo para limpiar el buffer
                
                String[] opciones = {
                "Mostrar informacion", "Simular paso del tiempo"};
                
                Runnable[] acciones = {
                    () -> Metodos.mostrarInfo(mascotaFinal),
                    () -> {
                        System.out.println("\nCuantos años desea simular?");
                        int pasoTiempo = scan.nextInt();
                        scan.nextLine();
                        Metodos.cumplirAnios(mascotaFinal, pasoTiempo);
                        Metodos.mostrarInfo(mascotaFinal);
                        }
                        
                
                };
                Metodos.menuDesplegado(opciones, acciones);
            }
            else {System.out.println("\nOpción incorrecta");
                  System.out.println("\nDesea crear una nueva mascota? S/N");
                  opcion = scan.nextLine().toUpperCase();
            }
        }
        if (opcion.equals("N")){
            System.out.println("Hasta pronto");
        }
    
    }    
         
    
    

    
}



