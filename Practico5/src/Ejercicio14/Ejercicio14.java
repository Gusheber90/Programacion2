/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author heber
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto =new Proyecto("La casa de papel", "01:45:28");
        EditorVideo editor = new EditorVideo();
        editor.editarVideo(".mp4", proyecto);
        
    }
    
}
