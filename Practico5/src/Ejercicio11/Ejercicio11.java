/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author heber
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Maná", "Pop-Rock");
        Cancion cancion = new Cancion("Rayando el Sol");
        cancion.setArtista(artista);
        
        Reproductor reproductor= new Reproductor();
        reproductor.reproducir(cancion);
    }
}
