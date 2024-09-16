package ar.edu.unju.escmi.poo.ejercicio3;

public class Empleado {
	private String nombre;
	private double salario; 
	private String legajo;
	
	public static final double SALARIO_MIN = 300000.00;
	public static final double AUMENTO = 10000.00;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, double salario, String legajo) {
		super();
		this.nombre = nombre;
		if (salario >= SALARIO_MIN) {
	        this.salario = salario;
	        }else {
	            this.salario = SALARIO_MIN;
	        }
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public static double getSalarioMin() {
		return SALARIO_MIN;
	}

	public static double getAumento() {
		return AUMENTO;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", legajo=" + legajo + "]";
	}

}
