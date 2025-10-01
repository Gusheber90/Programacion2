/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
/**
 *
 * @author heber
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
   
    public Usuario(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
        
        
    }

    public Celular getCelular() {
        return celular;
    }
    public void setCelular(Celular celular) {
    this.celular = celular;
    if(celular!=null && celular.getUsuario()!=this)
        celular.setUsuario(this);
    
    }
    public void mostrarUsuario(){
    if (celular!=null){
        System.out.println("\nUsuario: "+nombre+
                           "\nDNI: "+dni+
                           "\nCelular:"+celular.getMarca()+" "+ celular.getModelo());
    } else{ System.out.println("El usuario ingresado no tiene celular registrado");
}
}

  
    
    
}