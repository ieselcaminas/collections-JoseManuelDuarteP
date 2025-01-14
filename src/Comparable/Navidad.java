package Comparable;

import java.util.ArrayList;

public class Navidad {
    public static void main(String[] args) {
        ArrayList<Nino> lista = new ArrayList<Nino>();

        Nino n = new Nino(80,2);
        lista.add(n);
        n = new Nino(100,12);
        lista.add(n);
        n = new Nino(100,1);
        lista.add(n);

        lista.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
