
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * * @author heber
 */
public class Metodos {
    
    public static void mostrarMenu(String[] indicacion){
        System.out.println("===== MENÚ PRINCIPAL =====");
            for (int i=0; i < indicacion.length; i++){
                System.out.println(i+1 +". " + indicacion[i] + "\n");
               
            }
            
            System.out.println((indicacion.length + 1)+". Salir");

    }

    @SuppressWarnings("empty-statement")
    
   //Realice un menu desplegable a forma de metodo para que el mismo pueda ser reutilizado a futuro. 
    public static void menuDesplegado(String[] indicacion, Runnable[]acciones){
        Scanner scan= new Scanner (System.in);
        int opcion;
        int salir= indicacion.length +1;
       
        
        do {
            
            System.out.println("\n===== MENÚ PRINCIPAL =====\n");
            for (int i=0; i < indicacion.length; i++){
                System.out.println((i+1) +". " + indicacion[i] + "\n");
               
            }
            System.out.println(salir+". Salir");                      
            System.out.println("\nSeleccione una opción");
            opcion = scan.nextInt();
            
            if (opcion>=1 && opcion<= indicacion.length){
                acciones [opcion - 1].run();
            }    
            else if (opcion == salir){
                        System.out.println("\nGracias por su visita");
                }
            else {
                        System.out.println("\nOpción invalida intente nuevamente");
                }
                
        }while (opcion !=salir);    
    
    
    }
            
    public static Estudiante mostrarInfo(Estudiante e){
        System.out.println(e.nombre + " " + e.apellido + " " + e.curso + " " + e.calificación);
        return e;
    }
    
    public static Estudiante subirCalificacion(Estudiante n, double puntos){
        n.calificación +=puntos;
        return n;
        
    }
     public static Estudiante bajarCalificacion(Estudiante n, double puntos){
        n.calificación -=puntos;
        return n;
        
    }
     
     public static int cumplirAnios(Mascota mascota,  int tiempoTrans){
         mascota.edad += tiempoTrans;
         return mascota.edad;
     }
     public static Mascota mostrarInfo(Mascota a){
         System.out.println("Se llama "+ a.nombre + ", es de raza "+ a.especie + " y tiene " + a.edad + "años");
         return a;
     }

   
    public static void mostrarEstado(Gallina a){
        String estado="\nId: "+a.idGallina + "\nEdad: " + a.edad + "\nCantidad de huevos puestos: "+a.huevosPuestos;
        
        System.out.println(estado); 
    }
    
       

    public static int ponerHuevo(Gallina a, int huevos){
        Scanner scan = new Scanner (System.in);
        System.out.println("\nIngrese la cantidad de huevos que desea poner\n");
        huevos = scan.nextInt();
        a.huevosPuestos+=huevos;
        return huevos;

    }
    public static int envejecer (Gallina a, int años){
        Scanner scan = new Scanner (System.in);
        System.out.println("\nCuanto desea envejecer al animal?\n");
        años =+scan.nextInt();
        a.edad+=años;
        return años;
    }

    public static void mostrarEstado(NaveEspacial a){
        
        String estado ="\nNombre de la nave: "+a.nombre + "\nCarga: " + a.combustible + " unidades de combustible" + "\n Estado es " +a.getEstado();
        
        System.out.println(estado);
    }   
  
   
   
    public static void setDespegar(NaveEspacial a){
        if (a.combustible>0 && a.combustible<=120){
            a.setEstado(" EN VUELO");
            System.out.println("Estado de la nave" + a.getEstado());}
       
        
        else{
            System.out.println("La nave no puede despegar con el tanque vacio o mas de 120 unidades de combustible");
        }
    }
    
    public static double recargarCombustible(NaveEspacial a){
        System.out.println("Cuantos unidades de combustible desea recargar?");
        Scanner scan = new Scanner (System.in);
        double carga= scan.nextDouble();
        a.combustible+=carga;
        return a.combustible;
  
    }
    public static void distanciaRecorrida(NaveEspacial a){
            System.out.println("Por cada unidad de combustible recorre 50 km en 1 minuto y medio");
            double distancia= a.combustible *50;
            double tiempo=distancia/50*1.5;
            System.out.println("La nave recorrió "+ distancia+ " en " +tiempo +" minutos");
            
    }
}

