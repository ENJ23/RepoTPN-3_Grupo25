package ar.edu.unju.escmi.poo.ejercicio05;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Util {

	Scanner scanner = new Scanner(System.in);
	
	public void crearProducto(List<Producto> listaProductos) {
		System.out.println("Ingrese el nombre del producto: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese la descripcion del producto");
		String descripcion = scanner.nextLine();
		System.out.println("Ingrese el precio del producto [$00.00]");
		float precio = scanner.nextFloat();
		scanner.nextLine();
		
		Producto producto = new Producto(nombre, descripcion,precio);
		listaProductos.add(producto);
	}
	
	public void mostrarProductos(List<Producto> listaProductos) {
		
		if (listaProductos.isEmpty()) {
			System.out.println("No hay productos listados...");
		}else {
			for (Producto p : listaProductos) {
				System.out.println(p);
			}
		}
	}
	
	public void aumentarPrecio(List<Producto> listaProductos) {
		if (listaProductos.isEmpty()) {
			System.out.println("No hay productos en la lista...");
		}else {
			listaProductos = listaProductos.stream().map(producto -> {
				float nuevoPrecio = producto.getPrecio() + 300;
				producto.setPrecio(nuevoPrecio);
				return producto;
				}).toList();
		}
	}
	
	public void ordenarProductos(List<Producto> listaProductos) {
		
		if (listaProductos.isEmpty()) {
			System.out.println("No hay productos en la lista");
		}else {
		List<Producto> productosOrdenados = listaProductos.stream()
	            .sorted((p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()))
	            .collect(Collectors.toList());
		
		System.out.println("Mostrando productos ordenados");
		productosOrdenados.forEach(System.out::println);
		}
	}
	
	public void filtrarProductos(List<Producto> listaProductos) {
		if (listaProductos.isEmpty()) {
			System.out.println("No hay productos en la lista");
		}else {
			System.out.println("Ingrese un codigo para filtrar: ");
			String codFil = scanner.nextLine();
			if(codFil != null) {
			List<Producto> listaFiltrada = listaProductos.stream().filter(p -> (p.getCodigo().compareToIgnoreCase(codFil)) >= 0 ).toList();
			
			listaFiltrada.forEach(System.out::println);
			}
		}
	}
}
