
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public void setTitulo(String titulo) {
        if (titulo!=null){
            this.titulo = titulo;
    }
    }
    public void setAutor(String autor) {
        if (autor!= null){
            this.autor = autor;
    }
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 1500){
        this.añoPublicacion = añoPublicacion;
        }
        else{ 
            System.out.println("Ingresó un año invalido");
                
        }
    }
}    

    
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Desea crear una libro? S/N");
        String opcion= scan.nextLine();
        opcion= opcion.toUpperCase();
        Libro libro= null;
    
    
    while (libro == null && !opcion.equals("N")){ 
            if (opcion.equals("S")){
                libro = new Libro();
                final Libro libroFinal =libro;
                System.out.println("\nIngrese el nombre del libro");
                libro.setTitulo(scan.nextLine());
                
                System.out.println("\nQuien es el auto o autores del libro?");
                libro.setAutor(scan.nextLine());
                
                System.out.println("\nCual es el año de publicacion del mismo?");
                libro.setAñoPublicacion(scan.nextInt());
                scan.nextLine(); //lo utilizo solo para limpiar el buffer}
            String[] opciones = {
                "Informacion del libro", "modificar año de publicacion"};    
            Runnable[] acciones = {
                    () -> System.out.println("\nLibro: "+libroFinal.getTitulo() + "\nAutor: "+libroFinal.getAutor() + "\nAño de publicacion: "+libroFinal.getAñoPublicacion()),
                    () -> {
                        System.out.println("\nCambiar año de publicacion");
                        libroFinal.setAñoPublicacion(scan.nextInt());
                        scan.nextLine();
                        System.out.println("\nLibro: "+libroFinal.getTitulo() + "\nAutor: "+libroFinal.getAutor() + "\nAño de publicacion: "+libroFinal.getAñoPublicacion());
                        }
                        
                
                };    
            Metodos.menuDesplegado(opciones, acciones);
            }
            
    }
    }
}    