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
	
	public double sumarSalarios(HashSet<Empleado>listaEmpleados) {
		
	}
}
