package ar.edu.unju.escmi.poo.ejercicio05;

public class Producto {
	
	private String codigo;
	private String descripcion;
	private float precio;
	
	
	public Producto() {
		
	}
	
	public Producto(String codigo, String descripcion, float precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto " + "\n" + 
				"[Codigo=" + codigo + 
				"\nDescripcion=" + descripcion + 
				"\nPrecio=" + precio + "]" + 
				"\n--------------";
	}
	
	
}
