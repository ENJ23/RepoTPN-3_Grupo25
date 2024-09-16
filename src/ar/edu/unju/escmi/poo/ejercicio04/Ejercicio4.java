package ar.edu.unju.escmi.poo.ejercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        HashMap<String, Cliente> clientes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("----------------");
            System.out.println("1 - Dar de alta un Cliente.\n" + "2 - Mostrar Clientes.\n" + "3 - Eliminar Cliente.\n" + "4 - Salir del Menu.\n"); 
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Alta cliente");
                    break;

                case 2:
                    System.out.println("Mostrar todos los clientes");
                    break;

                case 3:
                    System.out.println("Eliminar cliente");
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}
