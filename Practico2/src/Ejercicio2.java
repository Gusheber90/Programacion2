
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author heber
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = scan.nextInt();
        
        int numMayor=num;
        int numMenor=num;
        
        
        for (int i=1; i<3; i++){
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            
            if (num>numMayor){
            numMayor= num;
            }
            if (num<=numMenor && numMenor!=0){
                numMenor=num;
            }
          
        }
        System.out.println("El número mayor es " + numMayor + " el número menor es " + numMenor );
    }
    
}
