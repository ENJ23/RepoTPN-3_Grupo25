package ar.edu.unju.escmi.poo.ejercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class Util {
	
	Scanner scanner = new Scanner(System.in);

	public void crearCliente(HashMap<String,Cliente> listaClientes) {
		System.out.println("Ingrese el nombre del Cliente: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el DNI: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese la categoría: [A...Z]");
		String categoriaString = scanner.nextLine();
        char categoria = categoriaString.charAt(0);
        
        String clave = dni.concat(categoriaString);
		Cliente cliente = new Cliente(dni, nombre, categoria);
		listaClientes.put(clave, cliente);
	}
	
	public void mostrarClientes(HashMap<String,Cliente> listaClientes) {
		
		if (!listaClientes.isEmpty()) {
			System.out.println("Lista de Clientes:");
	        for (Cliente cliente : listaClientes.values()) {
	            System.out.println(cliente);
	        }
		}else {
			System.out.println("La lista está vacía");
		}
	}
	
	public void eliminarCliente(HashMap<String,Cliente> listaClientes, String clave) {
		
		if (listaClientes.isEmpty()) {
			System.out.println("La lista esta vacia, no se puede eliminar ningun elemento");
		}else {
			System.out.println("Buscando cliente para eliminar...");
			if (listaClientes.containsKey(clave)) {
				listaClientes.remove(clave);
				System.out.println("Cliente eliminado exitosamente");
			}else {
				System.out.println("Cliente no encontrado");
			}
		}
	}
}