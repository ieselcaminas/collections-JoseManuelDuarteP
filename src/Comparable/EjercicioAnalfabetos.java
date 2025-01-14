package Comparable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EjercicioAnalfabetos {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("files/illiterate.csv"));
        String linea;
        lector.readLine();

        ArrayList<Analfabeto> an = new ArrayList<Analfabeto>();

        while ((linea = lector.readLine()) != null) {
            String[] datos = linea.split(",");
            Analfabeto a = new Analfabeto(datos[5], Integer.parseInt(datos[8]));
            an.add(a);
        }

        an.stream()
                .sorted()
                .forEach(System.out::println);

    }

}
