package Comparable;

import java.util.ArrayList;

public class Felipe {
    public static void main(String[] args) {
        ArrayList<Tarea> t = new ArrayList<Tarea>();

        Tarea tarea = new Tarea(1,6);
        t.add(tarea);
        tarea = new Tarea(2,4);
        t.add(tarea);
        tarea = new Tarea(3,5);
        t.add(tarea);
        tarea = new Tarea(3,6);
        t.add(tarea);

        t.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
