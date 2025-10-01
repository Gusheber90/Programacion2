/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author heber
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        
    
    Usuario usuario = new Usuario ("Gonzalo Barrios", "gonzo.ba87@gmail.com");
    GeneradorQR generador= new GeneradorQR();
    generador.generarQR("7894523", usuario);
    
    }    
}
