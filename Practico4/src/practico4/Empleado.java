/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4;

import java.util.Scanner;

/**
 *
 * @author heber
 */
public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private double salarioActual;
    private static int totalEmpleados=0;


    public Empleado(int id, String nombre, String cargo, double salarioActual){
        this.id=id;
        this.nombre=nombre;
        this.cargo=cargo;
        this.salarioActual=salarioActual;
        if (id > Empleado.totalEmpleados){
            Empleado.totalEmpleados = id;
                };
        System.out.println("Empleado" + this.nombre+" creado");
}

    public Empleado(String nombre, String cargo){
        this.id= ++totalEmpleados;
        this.nombre=nombre;
        this.cargo=cargo;
        this.salarioActual=1500000;
        
    }

    public void setId(int id) {
        if (id>0){
           this.id = id;  
        }
     else {
            System.out.println("Ingrese un ID positivo");
        }
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioActual() {
        return salarioActual;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioActual(double salarioNuevo) {
        if(salarioNuevo>0){
            this.salarioActual = salarioNuevo;
    }   else{
            System.out.println("El valor del salario debe ser positivo");
        }
    }
    
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0){
            double aumento= this.salarioActual * (porcentaje/100);
            this.salarioActual+= aumento;
            System.out.println("Para " +this.nombre+" el nuevo salario con un aumento del "+porcentaje+"% es de "+ this.salarioActual);
        } else {
            System.out.println("Debe ingresar un porcentaje positivo");
        }
            
       
    }
    public void actualizarSalario(int cantidadFija){
        if (cantidadFija>0){
            this.salarioActual+=cantidadFija;
            System.out.println("Para "+this.nombre+" a establecido un aumento de $"+ cantidadFija +" lo cual da un salario actual de $"+this.salarioActual);
        }
        else{
            System.out.println("La cantidad que desea aumentar debe ser mayor a cero");
        }
    }

   @Override
   public String toString(){
       return "\nID empleado: "+id+"\nNombre: "+nombre+"\nCargo: "+cargo+"\nSalario: $"+salarioActual;
   }
   
   public static void mostrarTotalEmpleados(){
       System.out.println("\nTotal de empleados trabajando: "+totalEmpleados);
   }

    public static void menuDesplegado(String[] indicacion, Runnable[]acciones){
        Scanner scan= new Scanner (System.in);
        int opcion;
        int salir= indicacion.length +1;
       
        
    do {
        
        System.out.println("\n===== MENÚ PRINCIPAL =====\n");
        for (int i=0; i < indicacion.length; i++){
            System.out.println((i+1) +". " + indicacion[i] + "\n");
           
        }
        System.out.println(salir+". Salir");                      
        System.out.println("\nSeleccione una opción");
        opcion = scan.nextInt();
        
       if (opcion>=1 && opcion<= indicacion.length){
            acciones [opcion - 1].run();
        }    
        else if (opcion == salir){
                    System.out.println("\nGracias por su visita");
            }
        else {
                    System.out.println("\nOpción invalida intente nuevamente");
           }
            
    }while (opcion !=salir); 

    }
}    
