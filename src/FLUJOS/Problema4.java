package FLUJOS;

import java.util.ArrayList;

public class Problema4 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(0);
        numeros.add(10);
        numeros.add(-4);
        numeros.add(3);

        numeros.stream()
                .filter(x -> x > 0 && x < 6)
                .forEach(x -> System.out.println(x));
    }
}
