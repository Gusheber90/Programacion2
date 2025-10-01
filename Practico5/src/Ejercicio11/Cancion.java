/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author heber
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    
    public Cancion(String titulo ){
        this.titulo=titulo;
    }

    public void setArtista(Artista artista) {
        if(artista != null){
        this.artista = artista;
        }
    }    
    public void mostrarArtista(){
        System.out.println("\nArtista: " +artista.getNombre() +
                           "\nGenero: " +artista.getGenero());
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    
}
