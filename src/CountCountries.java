import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        System.out.println(countCountries());
    }

    public static Map<String,Integer> countCountries () throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader
                ("files/Colfuturo-Seleccionados.csv"));
        String linea;
        Map<String,Integer> mapa = new HashMap<>();
        lector.readLine();

        while ((linea = lector.readLine()) != null) {
            String[] datos = linea.split(",");

            if (mapa.containsKey(datos[6])) {
                mapa.put(datos[6], mapa.get(datos[6]) + 1);
            } else {
                mapa.put(datos[6], 1);
            }

        }
        lector.close();
        return mapa;
    }

}
