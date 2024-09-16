package ar.edu.unju.escmi.poo.ejercicio04;
public class Cliente {
	
	private String dni;
	private String nombre;
	private char categoria;
	
	
	public Cliente() {	
	}
	
	public Cliente(String dni, String nombre, char categoria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.categoria = categoria;
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
	public char getCategoria() {
		return categoria;
	}
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Cliente " + "\n" +
				"[DNI=" + dni + "\n" +
				"nombre=" + nombre + "\n" +
				"categoria=" + categoria + "]";
	}

}