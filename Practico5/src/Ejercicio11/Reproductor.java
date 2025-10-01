/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author heber
 */
public class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("\nTitulo: "+cancion.getTitulo()+
                          "\nArtista o: "+cancion.getArtista().getNombre()+
                          "\nGenero: "+cancion.getArtista().getGenero());
    };
        
    
    
}
