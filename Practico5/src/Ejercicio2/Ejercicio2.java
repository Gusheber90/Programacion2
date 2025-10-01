/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import Utilidades.Menu;

/**
 *
 * @author heber
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria=new Bateria("4200mAh"); 
        bateria.setModelo("litio");
        
        Celular celular=new Celular ("987634567493261","Samsung","S24",bateria);
        celular.setBateria(bateria);
        
        
        Usuario usuario= new Usuario ("Juan Gomez", 36783201);
        usuario.setCelular(celular);
        
       
        
        
       String[] opciones={"Mostrar Celular", "Mostrar Usuario"};
        Runnable[] acciones = {
                () -> {celular.mostrarBateria();
                },
                () -> {usuario.mostrarUsuario();
                }
            };
        
        Menu.menuDesplegado(opciones, acciones); 
       
       
    }
    
}
