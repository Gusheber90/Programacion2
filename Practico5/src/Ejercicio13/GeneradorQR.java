/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author heber
 */
public class GeneradorQR {
    
    public void generarQR(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        System.out.println("Se creo codigo QR para "+codigo.getUsuario()+
                           "\nCodigo: "+codigo.getValor());
    }
    
}
