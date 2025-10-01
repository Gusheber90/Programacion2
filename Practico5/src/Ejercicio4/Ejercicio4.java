/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import Utilidades.Menu;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author heber
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco=new Banco("Santander", "30-50000845-4");
        Cliente cliente= new Cliente("Edgardo Bauza", 21345876);
        TarjetadeCredito tarjetaNueva = new TarjetadeCredito ("5643-2345-8765", "09/28", banco);
        tarjetaNueva.setBanco(banco);
        tarjetaNueva.setCliente(cliente);
        
        String[] opciones={"Mostrar Tarjeta de Credito", "Mostrar Banco","Mostrar Cliente"};
        Runnable[] acciones = {
                () -> {tarjetaNueva.mostrarBanco();
                },
                () -> {System.out.println(banco);
                },
                () -> {System.out.println(cliente);
                },
        };
        
        Menu.menuDesplegado(opciones, acciones); 
        
    }
    }
    

