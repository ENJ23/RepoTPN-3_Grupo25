package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String provincia;
	
	
	public Persona() {
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "JUJUY";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public int calcularEdad(LocalDate fechaNacimientoPersona) {
		
		LocalDate fechaActual = LocalDate.now();
		if (fechaNacimientoPersona != null && fechaNacimientoPersona != fechaActual) {
			return Period.between(fechaNacimientoPersona, fechaActual).getYears();
		}
		
		return 0;
		
	}

	public boolean esMayorDeEdad(int edadPersona) {
		
			if (edadPersona < 18) 
				return false;
		
		return true;
	}
	
	public void mostrarDatos(Persona persona) {
		
		System.out.println
		("Datos de la persona solicitada:" + "\n" +
		 "DNI: " + persona.dni + "\n" +
		 "Nombre: " + persona.nombre + "\n" +
		 "Edad: " + calcularEdad(persona.fechaNacimiento) + "\n" +
		 "Domicilio: " + persona.domicilio + "\n" +
		 "Provincia: " + persona.provincia);
		
		
	}
}