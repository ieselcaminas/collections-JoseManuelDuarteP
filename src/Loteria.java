import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Loteria {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();
        numeros.add("1112");
        numeros.add("2222");
        numeros.add("3333");
        numeros.add("4444");

        System.out.println(ultimoNumero(numeros));

    }

    public static Map<Character,Integer> ultimoNumero(ArrayList<String> numeros) {
        Map<Character, Integer> mapa = new HashMap<>();
        Character ultimo;
        Integer cont;

        for (String numero : numeros) {
            ultimo = numero.charAt(numero.length() - 1);
            cont = mapa.get(ultimo);
            if (cont == null) {
                mapa.put(ultimo, 1);
            } else {
                mapa.put(ultimo, cont + 1);
            }
        }
        return mapa;
    }

    /*public static Map<Character,Integer> ultimoNumero(ArrayList<String> numeros) {
        Map<Character, Integer> mapa = new HashMap<>();

        for (String numero : numeros) {
            if (mapa.containsKey(numero.charAt(numero.length() - 1))) {
                mapa.put(numero.charAt(numero.length()-1), mapa.get(numero.charAt(numero.length()-1)) + 1);
            } else {
                mapa.put(numero.charAt(numero.length()-1), 1);
            }
        }
        return mapa;
    }*/

}