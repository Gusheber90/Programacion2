/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import  java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Por favor ingrese su nombre");
        String name = lector.nextLine();
        System.out.println("Ahora ingrese su edad");
        int edad = lector.nextInt();
        
        System.out.println("Un gusto " + name + ", asi que tenes " + edad + " años");
    }
}
