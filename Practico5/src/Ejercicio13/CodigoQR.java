/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author heber
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;
    
    public CodigoQR( String valor, Usuario usuario){
        this.valor=valor;
        this.usuario=usuario;
    }
    
    public void mostrarUsuario(){
        if (usuario!=null){
        System.out.println("\nNombre: "+ usuario.getNombre()
                          +"\nemail: "+usuario.getEmail());
        }
    }    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public String getValor() {
        return valor;
    }
    
    
    
}
