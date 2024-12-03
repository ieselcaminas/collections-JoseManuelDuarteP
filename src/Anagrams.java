import java.util.*;
import java.io.*;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        System.out.println(anagrams());
    }

    public static Map<String,ArrayList<String>> anagrams() throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        Map<String,ArrayList<String>> repetidas = new HashMap<>();
        ArrayList<String> palabras = new ArrayList<>();
        String linea;

        //Comprobamos que la línea no esté vacía
        while ((linea = lector.readLine()) != null) {

            //Alfabetizamos la línea
            String ordenada = ordenarPalabra(linea);

            if (repetidas.containsKey(ordenada)) {
                //Añadimos la nueva palabra al ArrayList ya existente
                palabras.add(linea);
                repetidas.put(ordenada, palabras);
            } else {
                //Creamos nuevo ArrayList para palabra que no estaba
                palabras = new ArrayList<>();
                palabras.add(linea);
                repetidas.put(ordenada, palabras);
            }

        }
        lector.close();
        return repetidas;
    }

    private static String ordenarPalabra(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}