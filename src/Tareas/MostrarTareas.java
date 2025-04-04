package Tareas;

import java.util.ArrayList;

public class MostrarTareas {
    public void listarTareas(GestorTareas gestor) {
        ArrayList<String> tareas = gestor.getListaOriginal();
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("\n--- TAREAS ---");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }
}