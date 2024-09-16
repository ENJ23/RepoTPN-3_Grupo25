package ar.edu.unju.escmi.poo.ejercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Cliente> listaClientes = new HashMap<>();
		Util util = new Util();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			System.out.println("Menú de Opciones");
			System.out.println("----------------");
			System.out.println
			("1 - Dar de alta un Cliente.\n" + 
			 "2 - Mostrar Clientes.\n" +
			 "3 - Eliminar Cliente.\n" +
			 "4 - Salir del Menu.\n"); 
			System.out.println("Ingrese una opción");
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
			
			case 1:	
					util.crearCliente(listaClientes);
					break;
			case 2:
					util.mostrarClientes(listaClientes);
					break;
					
			case 3: 
					System.out.println("Digite la clave del cliente a Eliminar: ");
					String claveBuscada = scanner.nextLine();
					util.eliminarCliente(listaClientes, claveBuscada);
					break;
					
			case 4: 
					
					System.out.println("Saliendo del menu...");
			default:
				System.out.println("Opcion fuera de rango [1...5]");
			}
			
		}while (opcion != 4);

	scanner.close();
	}
}
