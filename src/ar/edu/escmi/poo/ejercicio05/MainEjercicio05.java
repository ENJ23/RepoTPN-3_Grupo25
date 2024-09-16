package ar.edu.escmi.poo.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEjercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Util util = new Util();
		int opcion = 0;
		
	
		do {
			try {
			System.out.println("Menú de Opciones");
			System.out.println("----------------");
			System.out.println
			("1 - Dar de alta un producto..\n" + 
			 "2 - Mostrar productos.\n" +
			 "3 - Incrementar precio de productos.\n" +
			 "4 - Ordenar los productos.\n" +
			 "5 - Filtrar productos. \n" + 
			 "6 - Salir");
			System.out.println("Ingrese una opción");
			
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			}catch(Exception e) {
				System.out.println("Opcion Inválida. Intente de nuevo ");
				scanner.nextLine();
				opcion = 999;
			}
			
			//if (opcion < 1 || opcion > 6) System.out.println("Numero fuera de rango [1-5]");
			
			switch(opcion) {
			
			case 1:	
					util.crearProducto(listaProductos);
					break;
			case 2:
					util.mostrarProductos(listaProductos);
					break;
					
			case 3: 
					util.aumentarPrecio(listaProductos);
					break;
					
			case 4: 
					util.ordenarProductos(listaProductos);
					break;
			
			case 5:
					util.filtrarProductos(listaProductos);
					break;
			case 6: 
				
					break;
					

			default:
				
				System.out.println("*Numero fuera de rango [1-5]*");
				break;
				
			}
				
		}while (opcion != 6);
	
	scanner.close();
	
	}
}
