/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author heber
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String imei, String marca,String modelo, Bateria bateria){
            this.imei =imei;
            this.setMarca (marca);
            this.setModelo(modelo);
            this.bateria=bateria;
    }  
    
    public void mostrarBateria(){
        if(bateria!=null){
            System.out.println("\nImei del producto " +imei+
                               "\nMarca del equipo: "+ marca+
                               "\nModelo del equipo: " +modelo+
                                "\nBateria: "+bateria.getModelo());
            
        } else{ System.out.println("Debe agregar una bateria al equipo");
    
    }


}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public String getModelo() { //Este es el modelo del celular
        return modelo;
    }

    public String getMarca() {
        return marca;
    }


}    
