package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.HashSet;
import java.util.Scanner;

public class Util {
	Scanner scanner = new Scanner(System.in);
	public static final double SALARIO_MIN = 300000.00;
	public static final double AUMENTO = 10000.00;
	
	public void crearEmpleado(HashSet<Empleado>listaEmpleados) {
	System.out.println("Ingresar Nombre del Empleado");
	String nombre = scanner.nextLine();
	System.out.println("Ingresar Salario");
	Double salario = scanner.nextDouble();
	scanner.nextLine();
	System.out.println("Ingresar Legajo");
	String legajo = scanner.nextLine();
	
	Empleado empleado = new Empleado(nombre,salario,legajo);
	listaEmpleados.add(empleado);
	}
	
	public void aumetarSalario(Empleado empleado) {
	
	empleado.setSalario(empleado.getSalario()+AUMENTO);
	
	}
	
	public double sumarSalarios (HashSet<Empleado> listaEmpleados) {

        double suma = 0;

        if (listaEmpleados.isEmpty()) {
            return 0;
        }else {

            for (Empleado e : listaEmpleados) {
                suma += e.getSalario(); //suma = suma + e.getSalario();
            }
        }
        return suma;
    }
	
	public Empleado buscarEmpleado (HashSet<Empleado> listaEmpleados, String legajo) {

        if (legajo != null) {
            for (Empleado e : listaEmpleados) {
                if (e.getLegajo().equals(legajo)) {
                    return e;
                }
            }
        }
        return null;
    }
	
	public void recorrerLista (HashSet<Empleado> listaEmpleados) {
		if (listaEmpleados.isEmpty()) {
            System.out.println("esta lista esta vacia");
        }else {

            for (Empleado e : listaEmpleados) {
               System.out.println(e);
            }
        }
	}
}
