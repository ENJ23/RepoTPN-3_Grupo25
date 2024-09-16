package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEjercicio1 {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			
			System.out.println("Menú de Opciones");
			System.out.println("----------------");
			System.out.println
			("1 - Crear objeto con Constructor por defecto.\n" + 
			 "2 - Crear objeto con Constructor parametrizado.\n" +
			 "3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento).\n" +
			 "4 - Mostrar personas.\n" +
			 "5 - Salir del Menu");
			System.out.println("Ingrese una opción");
			
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			
			case 1:	
					Persona persona = new Persona();
					listaPersonas.add(persona);
					break;
			case 2:
					System.out.println("Ingrese el DNI: ");
					String dniParam = scanner.nextLine();
					System.out.println("Ingrese el Nombre: ");
					String nombreParam = scanner.nextLine();
					System.out.println("Ingrese la fecha de nacimiento: (dd--mm-yyyy)");
					LocalDate fechaNacimientoParam = LocalDate.parse( scanner.nextLine());
					Persona personaParametrizada = new Persona(dniParam, nombreParam, fechaNacimientoParam, "JUJUY");
					listaPersonas.add(personaParametrizada);
					break;
					
			case 3: 
					System.out.println("Ingrese el DNI: ");
					String dniCompleto = scanner.nextLine();
					System.out.println("Ingrese el Nombre: ");
					String nombreCompleto = scanner.nextLine();
					System.out.println("Ingrese la fecha de nacimiento: (yyyy-mm-dd)");
					LocalDate fechaNacimientoCompleto = LocalDate.parse( scanner.nextLine());
					System.out.println("Ingrese el domicilio: ");
					String domicilioCompleto = scanner.nextLine();
					System.out.println("Ingrese la provincia: ");
					String provinciaCompleto = scanner.nextLine();
					
					Persona personaCompleta = new Persona(dniCompleto, nombreCompleto, fechaNacimientoCompleto, domicilioCompleto, provinciaCompleto);
					listaPersonas.add(personaCompleta);
					break;
					
			case 4: 
				int numero = 1;
					if (listaPersonas.isEmpty()) {
						System.out.println("No hay personas");
					}else {
						for (Persona p : listaPersonas) {
							System.out.println("Persona Nº" + numero + "\n" + "-----------------------");
							numero++;
							System.out.println
							("DNI: " + p.getDni() + "\n" + 
							 "Nombre: " + p.getNombre() + "\n" +
							 "Fecha de Nacimiento: " + p.getFechaNacimiento() + "\n" +
							 "Domicilio: " + p.getDomicilio() + "\n" + 
							 "Provincia: " + p.getProvincia() + "\n" 
							);
						}
					}
			case 5: 
					System.out.println("Saliendo del programa...");
				
			default:
				System.out.println("Opcion Invalida");
				break;
			}
		}while (opcion != 5);
	scanner.close();
	}

}