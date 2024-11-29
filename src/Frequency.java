import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Chorizo");
        palabras.add("Chopper");
        palabras.add("Mortadela");
        palabras.add("Chorizo");

        System.out.println(contarPalabras(palabras));

    }

    public static Map<String,Integer> contarPalabras(ArrayList<String> palabras) {
        Map<String,Integer> map = new HashMap<>();

        for (String palabra : palabras) {
            if (map.containsKey(palabra)) {
                map.put(palabra, map.get(palabra) + 1);
            } else {
                map.put(palabra, 1);
            }
        }
        return map;
    }

}
