package ar.edu.unju.escmi.poo.ejercicio2;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<GatoSimple> gatos = new TreeSet<>();
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Crear gato simple");
            System.out.println("2 - Dar de comer a un gato simple");
            System.out.println("3 - Eliminar un gato simple");
            System.out.println("4 - Mostrar todos los gatos");
            System.out.println("5 - Crear gato contrincante para pelear con un gato simple");
            System.out.println("6 - Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del gato: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = scanner.nextLine();
                    gatos.add(new GatoSimple(color, peso, raza, edad, nombre, sexo));
                    System.out.println("Gato creado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del gato al cual dar de comer: ");
                    String nombreGatoComer = scanner.nextLine();
                    GatoSimple gatoComer = buscarGato(gatos, nombreGatoComer);
                    if (gatoComer != null) {
                        System.out.print("Ingrese la comida: ");
                        String comida = scanner.nextLine();
                        gatoComer.comer(comida);
                    } else {
                        System.out.println("El gato no fue encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del gato a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    GatoSimple gatoEliminar = buscarGato(gatos, nombreEliminar);
                    if (gatoEliminar != null) {
                        gatos.remove(gatoEliminar);
                        System.out.println("Gato eliminado exitosamente.");
                    } else {
                        System.out.println("El gato no fue encontrado.");
                    }
                    break;

                case 4:
                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos.");
                    } else {
                        for (GatoSimple gato : gatos) {
                            System.out.println(gato);
                            gato.maullar();
                            gato.ronronear();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nombre del gato contrincante: ");
                    String nombreContrincante = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorContrincante = scanner.nextLine();
                    System.out.print("Peso: ");
                    double pesoContrincante = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Raza: ");
                    String razaContrincante = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadContrincante = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Sexo (macho/hembra): ");
                    String sexoContrincante = scanner.nextLine();
                    GatoSimple gatoContrincante = new GatoSimple(colorContrincante, pesoContrincante, razaContrincante, edadContrincante, nombreContrincante, sexoContrincante);
                    gatos.add(gatoContrincante);
                    System.out.print("Ingrese el nombre del gato con el que peleará: ");
                    String nombreGatoPelea = scanner.nextLine();
                    GatoSimple gatoPelea = buscarGato(gatos, nombreGatoPelea);
                    if (gatoPelea != null) {
                        gatoPelea.pelear(gatoContrincante);
                    } else {
                        System.out.println("El gato no fue encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
        scanner.close();
    }

    private static GatoSimple buscarGato(TreeSet<GatoSimple> gatos, String nombre) {
        for (GatoSimple gato : gatos) {
            if (gato.getNombre().equalsIgnoreCase(nombre)) {
                return gato;
            }
        }
        return null;
    }
    
}