/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import Utilidades.Menu;

/**
 *
 * @author heber
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario usuario =new Usuario ("Enrique Martinez", "emartinez@gmail.com");
        Documento documento = new Documento ("El caos en la matemática","investigacion sobre teoria del caos en matemática", "9B7825J32A", "20/04/2017", usuario); 
        
        documento.mostrarFirmaDigital();
}
}   

