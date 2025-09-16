/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author heber
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        List<Empleado> listaDeEmpleados=new ArrayList<>();
        String opcion;    
       
        do{
        System.out.println("Desea cargar un nuevo empleado? S/N");
        opcion= scan.nextLine().toUpperCase();
        
            if (opcion.equals("S")){
                System.out.println("Desea cargar todos los datos del empleado? S/N");
                String opcion2=scan.nextLine().toUpperCase();
                
                    if (opcion2.equals("S")){
                        System.out.println("\nIngrese el Id del nuevo empleado ");
                        int id=scan.nextInt();
                        scan.nextLine();
                        
                        System.out.println("\nPor favor ingrese el nombre");
                        String nuevoEmpleado = scan.nextLine();
                        System.out.println("\nIngrese su cargo");
                        String puesto= scan.nextLine();
                        System.out.println("Ingrese su sueldo");
                        double sueldo=scan.nextDouble();
                        scan.nextLine();
                        
                        Empleado nuevoEmp=new Empleado(id,nuevoEmpleado,puesto,sueldo);
                        listaDeEmpleados.add(nuevoEmp);
                    }
                    else if (opcion2.equals("N")){
                        
                    
                        System.out.println("\nPor favor ingrese el nombre");
                        String nuevoEmpleado = scan.nextLine();
                        System.out.println("\nIngrese su cargo");
                        String puesto= scan.nextLine();
                        
                        
                        Empleado nuevoEmp=new Empleado(nuevoEmpleado,puesto);
                        listaDeEmpleados.add(nuevoEmp);
                
                
                    
            }else {
                System.out.println ("Ingresó un caracter incorrecto por favor ingrese S o N");
            }
     
        }
        }    
        while (!opcion.equals("N"));
        
        if(listaDeEmpleados.isEmpty()){
            System.out.println("No se cargó ningun empleado");}
        else{
            System.out.println("\nEmpleados Cargados");
            for (Empleado emp : listaDeEmpleados){
                System.out.println(emp.toString());
            }
        }
        
        String[] opciones={"Desea actualizar salario?", "imprimir informacion de los empleados", "Total de empleados creados"};
    
        Runnable[] acciones={
                
                () -> {
                    System.out.println("Que empleado modificara su sueldo? Indiquelo por ID de empleado");
                    int idBuscado =scan.nextInt();
                    scan.nextLine();
                    
                    Empleado empleadoAmodificar =null;
                    for (Empleado emp: listaDeEmpleados){
                        if (emp.getId()== idBuscado){
                            empleadoAmodificar = emp;
                            break;
                    }
                    }    
                    System.out.println("Indique si desea incrementar por monto fijo (1) o porcentaje (2)");
                    int opcion3=scan.nextInt();
                    scan.nextLine();
                        if (opcion3==1){
                        int montoFijo=scan.nextInt();
                        scan.nextLine();
                        empleadoAmodificar.actualizarSalario(montoFijo);
                        }
                        else if (opcion3==2){
                        double montoPorcentaje =scan.nextDouble();
                        scan.nextLine();
                        empleadoAmodificar.actualizarSalario(montoPorcentaje);
                        }
                 },
                () ->{  System.out.println("Ingrese el Id delempleado que desea buscar");
                        int idBuscado=scan.nextInt();
                        for (Empleado emp : listaDeEmpleados) {
                            if (emp.getId()==idBuscado){
                            System.out.println(emp.toString());
                            break;
                            }
                        }    
                },
                () ->{
                    System.out.println("El total de empleados cargados es de "+Empleado.getTotalEmpleados());
                },
                };
                
    
        Empleado.menuDesplegado(opciones, acciones);
    }
    
}
    
