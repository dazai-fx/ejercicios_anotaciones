package org.iesvdm.ejercicio3;

import java.util.ArrayList;
import java.util.List;
public class AgendaSemana {
    private List<String> tareasSemana;

    public AgendaSemana(Class<?> clazz) {
        tareasSemana = new ArrayList<>();
        procesarAnotaciones(clazz);
    }

    private void procesarAnotaciones(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tareas.class)) {
            Tareas tareasAnotadas = clazz.getAnnotation(Tareas.class);
            for (Tarea tarea : tareasAnotadas.value()) {
                agregarTarea(tarea);
            }
        } else if (clazz.isAnnotationPresent(Tarea.class)) {
            Tarea tarea = clazz.getAnnotation(Tarea.class);
            agregarTarea(tarea);
        }
    }

    private void agregarTarea(Tarea tarea) {
        tareasSemana.add(tarea.titulo() + ": " + tarea.descripcion() + ": " + tarea.diaSemana() + ": " + tarea.hora());
    }

    public void mostrarTareas() {
        System.out.println("Tareas de la semana:");
        for (String tarea : tareasSemana) {
            System.out.println(tarea);
        }
    }

    public List<String> getTareasSemana() {
        return tareasSemana;
    }

}
