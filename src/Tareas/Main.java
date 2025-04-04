package Tareas;

import Tareas.GestorTareas;
import Tareas.MostrarTareas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        MostrarTareas mostrar = new MostrarTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestor.agregarTarea();
                    break;
                case 2:
                    mostrar.listarTareas(gestor);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}