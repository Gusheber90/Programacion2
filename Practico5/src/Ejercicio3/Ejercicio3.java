/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import Utilidades.Menu;
import java.util.HashSet;

/**
 *
 * @author heber
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Autor autor= new Autor("Julio Cortazar","Argentino");
        Editorial editorial= new Editorial("Planeta", "Av. Diagonal 662");
        Libro libro =new Libro(98624531,"Rayuela", editorial);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
               String[] opciones={"Mostrar Libro", "Mostrar Autor","Mostrar Editorial"};
        Runnable[] acciones = {
                () -> {libro.mostrarAutor();
                },
                () -> {System.out.println(autor);
                },
                () -> {System.out.println(editorial);
                },
        };
        
        Menu.menuDesplegado(opciones, acciones); 
        
    }
    
        
}

