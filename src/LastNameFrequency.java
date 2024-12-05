import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LastNameFrequency {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nomUsu;

        do {
            System.out.print("Nombre de la consulta: \n(Introduzca espacio para salir)\n");
            nomUsu = sc.nextLine();

            System.out.println(frequency(nomUsu.toUpperCase()));

        } while (!nomUsu.isEmpty());

    }

    public static String frequency (String nomUsu) throws IOException {
        BufferedReader lector = new BufferedReader (new FileReader
                ("files/LastnameFrequencies.csv"));
        Map<String,String> frecuencia = new HashMap<>();
        String linea;
        String[] valores;

        while ((linea = lector.readLine()) != null) {
            valores = linea.split(",");
            if (valores.length != 2) continue;
            frecuencia.put(valores[0], valores[1]);

            if (frecuencia.containsKey(nomUsu)) {
                return valores[1];
            }

        }
        if (nomUsu.isEmpty()) {
            return "Fin";
        } else {
            return "Ese apellido no está registrado";
        }
    }
}