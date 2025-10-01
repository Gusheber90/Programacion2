package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String img, String formato){
        this.imagen=img;
        this.formato=formato;
    
}

    public String getImagen() {
        return imagen;
    }
    
@Override
public String toString(){
    return "Imagen "+ imagen ;
}
}
