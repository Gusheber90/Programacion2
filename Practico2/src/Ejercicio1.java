
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Ingresá un año vamos a analizar si es biciesto");
        int año=scan.nextInt();
        if ((año%4==0) && ((año%100!=0)|| año%400==0) ){
            System.out.println(año+" es un año biciesto");
        }
        else{
            System.out.println("Es un año normal");
        }
    }
}
