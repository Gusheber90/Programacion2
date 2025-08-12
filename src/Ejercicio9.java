/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextInt(); // ERROR
    System.out.println("Hola, " + nombre);
    }
}
/*El error es que define la variable "nombre" como de tipo cadena, pero intenta asignarle un valor entero ingresado por el usuario */
