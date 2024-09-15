package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<Empleado> listaEmpleados = new HashSet<>();
    Scanner cin = new Scanner (System.in);
    Util util = new Util();
    int opcion = 0;
    try {
    do {
    System.out.println("Menú de Opciones");
                System.out.println("----------------");
                System.out.println
                ("1 - Crear un empleado.\n" + 
                 "2 - Aumentar salario de un Empleado.\n" +
                 "3 - Mostrar la suma total de todos los salarios.\n" +
                 "4 - Mostrar empleados.\n" +
                 "5 - Salir del Menu");
                System.out.println("Ingrese una opción");
                opcion = cin.nextInt();
                
                cin.nextLine();
                
                switch (opcion) {
                
                case 1:
                
                	util.crearEmpleado(listaEmpleados);
                break;
                
                case 2:
                
                System.out.println("Ingrese el legajo del empleado que desea que tenga un aumento");
                String legajoBuscar = cin.nextLine();
                Empleado empleado = util.buscarEmpleado(listaEmpleados, legajoBuscar);
                util.aumetarSalario(empleado);
                
                break;
                
                case 3:
                	
                	double salarioSuma=util.sumarSalarios(listaEmpleados);
                	System.out.println("El salario total es: " + salarioSuma);
                	break;
                case 4:
                	util.recorrerLista(listaEmpleados);
                    break;
                	
                case 5:
                	System.out.println("Cerrando Menu...");
                	break;
                default:
                	System.out.println("Opcion Invalida, cerrando programa...");
                	break;
                }
                
    }  while (opcion != 5);  
    }catch(Exception e) {
    	System.out.println("Ingresar un Numero");
    }
	}

}
