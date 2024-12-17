package RefuerzoII;

public class Ejercicio3 {

    public static void main(String[] args) {
        String numero = "3433";

        System.out.println(sumaDigitos(numero));
    }

    public static String sumaDigitos(String numero) {
        String resultado = "";
        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {

            if (i == numero.length() - 1) {
                resultado += numero.charAt(i);
            } else {
                resultado += numero.charAt(i) + " + ";
            }
            suma += Integer.parseInt("" + numero.charAt(i));
        }

        return resultado + " = " + suma;
    }

}
