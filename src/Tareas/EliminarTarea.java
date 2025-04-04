package Tareas;

import java.util.ArrayList;
import java.util.List;

public class EliminarTarea {
    public void eliminarTarea(GestorTareas gestor, int indice) {
        List<String> tareas = gestor.getTareas();
        if (indice >= 0 && indice < tareas.size()) {
            String tareaEliminada = tareas.remove(indice);
            System.out.println("🗑️ Tarea eliminada: '" + tareaEliminada + "'");
        } else {
            System.out.println("❌ Error: Índice no válido.");
        }
    }
}