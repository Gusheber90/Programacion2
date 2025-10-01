/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author heber
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public String getCodigoHash() {
        return codigoHash;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario){
        this.codigoHash=codigoHash;
        this.fecha=fecha;
        this.usuario=usuario;
    }
    

}
