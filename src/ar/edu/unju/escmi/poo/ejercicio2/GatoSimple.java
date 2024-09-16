package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Objects;

public class GatoSimple implements Comparable<GatoSimple>{
		private String color;
		private double peso;
		private String raza;
		private int edad;
		private String nombre;
		private String sexo;
		
		public GatoSimple(String color, double peso, String raza, int edad, String nombre, String sexo) {
	        this.color = color;
	        this.peso = peso;
	        this.raza = raza;
	        this.edad = edad;
	        this.nombre = nombre;
	        this.sexo = sexo;
	    }
		public void maullar() {
			System.out.println("Miauu");
		}

		public void ronronear() {
			System.out.println("prrrr");
		}

		public void comer(String comida) {
			if (comida.equalsIgnoreCase("pescado")) {
				System.out.println("Que rico ¡Gracias!");
			} else {
				System.out.println("Lo siento, yo solo como pescado");
			}
		}

		public void pelear(GatoSimple gatoContrincante) {
			if (this.sexo.equalsIgnoreCase("hembra")) {
				System.out.println("No me gusta pelear");
			} else if (this.sexo.equalsIgnoreCase("macho")) {
				if (gatoContrincante.sexo.equalsIgnoreCase("hembra")) {
					System.out.println("No peleo contra gatitas");
				} else {
					System.out.println("¡Ven aquí que te vas a enterar!");
				}
			}
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public String getRaza() {
			return raza;
		}
		public void setRaza(String raza) {
			this.raza = raza;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		@Override
		public String toString() {
			return "GatoSimple [color=" + color + ", peso=" + peso + ", raza=" + raza + ", edad=" + edad + ", nombre="
					+ nombre + ", sexo=" + sexo + "]";
		}
		 @Override
		    public int compareTo(GatoSimple o) {
		        return this.nombre.compareTo(o.nombre);
		    }

		    @Override
		    public boolean equals(Object o) {
		        if (this == o) return true;
		        if (o == null || getClass() != o.getClass()) return false;
		        GatoSimple that = (GatoSimple) o;
		        return Objects.equals(nombre, that.nombre);
		    }

		    @Override
		    public int hashCode() {
		        return Objects.hash(nombre);
		    }
}
