package org.losremedios.ut5.actividades.ActividadListas52;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.losremedios.ut5.actividades.ActividadListas52.TaskList.*;


public class Main {
    public static void main(String[] args) {
        List<String> tarea1=new LinkedList<>();
        List<String> tarea2=new ArrayList<>();


        addTask (tarea1, "Tarea 1");
        addTask (tarea1, "Tarea 2");
        addTask (tarea1, "Tarea 3");

        System.out.println(tarea1);

        removeTask (tarea1, "Tarea 2");
        System.out.println(tarea1);

        completeTask(tarea1, "Tarea 3");
        System.out.println(tarea1);

        getTask(tarea1);
        System.out.println(tarea1);

    }
}
