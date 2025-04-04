package Tareas;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class EliminarTarea {
    public void eliminarTarea(GestorTareas gestor, int indice) {
        ArrayList<String> tareas = gestor.getListaOriginal();
        if (indice >= 0 && indice < tareas.size()) {
            String tareaEliminada = tareas.remove(indice);
            System.out.println("🗑️ Tarea eliminada: '" + tareaEliminada + "'");
        } else {
            System.out.println("❌ Error: Índice no válido.");
        }
    }
}

