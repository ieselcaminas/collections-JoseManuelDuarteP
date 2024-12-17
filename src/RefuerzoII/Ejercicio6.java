package RefuerzoII;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;

        System.out.println("Ingrese el numero: ");
        num = sc.nextLine();

        if(esHyperpar(num))
            System.out.println("Es Hyperpar");
        else
            System.out.println("No es Hyperpar");

    }

    public static boolean esHyperpar(String num) {
        int c;

        for (int i = 0; i <= num.length() - 1; i++) {
            c = num.charAt(i);

            if (!(c % 2 == 0)) {
                return false;
            }

        }

        return true;
    }

}
