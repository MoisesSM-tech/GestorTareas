package Tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTareas {

    private List<String> tareas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarTarea() {
        System.out.println("Ingrese una nueva tarea:");
        String tarea = scanner.nextLine();
        tareas.add(tarea);
        System.out.println("Tarea añadida correctamente.");
    }

    public List<String> getTareas() {
        return tareas;
    }
}