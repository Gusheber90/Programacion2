/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author heber
 */
public class EditorVideo {
    public void editarVideo(String formato, Proyecto proyecto){
        Render render =new Render (formato,proyecto);
        System.out.println(render.getProyecto()+ "\nFormato: "+render.getFormato());
        
        
    }
    
}
