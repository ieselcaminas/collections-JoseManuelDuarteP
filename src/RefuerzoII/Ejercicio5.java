package RefuerzoII;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 6, 17, 18, 22, 35, 46, 109, 143, 200};

        System.out.println(mediana(numeros));
    }

    public static boolean esPar(int[] numeros) {
        return numeros.length % 2 == 0;
    }

    public static double mediana (int[] numeros) {
        int medioPar1;
        int medioPar2;
        int fin;
        Arrays.sort(numeros);

        if (esPar(numeros)) {
            medioPar1 = numeros[numeros.length / 2];
            medioPar2 = numeros[(numeros.length / 2) - 1];
            fin = (medioPar1 + medioPar2) / 2;
        } else {
            fin = numeros[numeros.length / 2];
        }
        return fin;
    }
}