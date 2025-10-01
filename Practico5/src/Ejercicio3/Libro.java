/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author heber
 */
public class Libro {
    private int isbn;
    private String titulo;
    private Editorial editorial;
    private Autor autor;
    
    public Libro (int isbn, String titulo, Editorial editorial){
        this.isbn=isbn;
        this.titulo=titulo;
        this.editorial=editorial;
    }
    public void mostrarAutor(){
        if ((autor!=null) && (editorial!=null)){
            System.out.println("\nISBN: "+isbn+
                               "\nTitulo "+titulo+
                               "\nAutor: "+autor.getNombre()+
                               "\nEditorial: "+editorial.getNombre());
        }
    }

    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}

