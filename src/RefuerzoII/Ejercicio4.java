package RefuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 5, 5, 5, 6, 16, 76, 76};

        System.out.println(moda(numeros));
    }

    public static int moda(int[] numeros) {
        Map<Integer, Integer> mapa = new HashMap<>();
        int masRepetido = 0;
        int moda = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (mapa.containsKey(numeros[i])) {
                mapa.put(numeros[i], mapa.get(numeros[i]) + 1);
            } else {
                mapa.put(numeros[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > masRepetido) {
                masRepetido = entry.getValue();
                moda = entry.getKey();
            }
        }

        return moda;
    }
}
