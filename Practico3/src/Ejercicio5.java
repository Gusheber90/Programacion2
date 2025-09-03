
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
class NaveEspacial {
    public String nombre;
    public double combustible;
    private String estado="DETENIDO";

    public String getEstado() {
        return estado;

    }
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
                
        System.out.println("Desea crear una nave espacial? S/N");
        String opcion= scan.nextLine().toUpperCase();
        
    if (opcion.equals("S")){
        
        NaveEspacial nave=new NaveEspacial();
        
        System.out.println("Como se llama la nave");
        nave.nombre=scan.nextLine();
        
        System.out.println("Cuantas unidades de combustible tiene la nave?");
        nave.combustible=scan.nextDouble();
        
        
        Metodos.mostrarEstado(nave);
        
    
        String[] opciones={"Desea realizar un despegue?", "Cargar combustible", "Ver distancia que puede recorrer", "Estado de la nave"};
    
        Runnable[] acciones={
                () -> {Metodos.setDespegar(nave);
                },
                () ->{Metodos.recargarCombustible(nave);
                },
                () ->{Metodos.distanciaRecorrida(nave);
                },
                () ->{Metodos.mostrarEstado(nave);}
    };
        Metodos.menuDesplegado(opciones, acciones);
    }
}
}    