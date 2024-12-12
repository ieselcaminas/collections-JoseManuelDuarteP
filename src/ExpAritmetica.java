import java.util.Stack;

public class ExpAritmetica {
    public static void main(String[] args) {
        String cadena = "5 1 2 + 4 * + 3 -";

        System.out.println(calculo(cadena));
    }

    public static boolean esNumero(String cadena) {
        return Character.isDigit(cadena.charAt(0));
    }

    public static int calculo(String expresion) {
        String[] terminos = expresion.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Integer resultado = 0;
        Stack<Integer> pila = new Stack<>();

        for (int i = 0; i < terminos.length; i++) {
            if (esNumero(terminos[i])) {
                numero = Integer.parseInt("" + terminos[i]);
                pila.push(numero);
            } else {
                n2 = pila.pop();
                n1 = pila.pop();

                switch (terminos[i]) {
                    case "+":
                        pila.push(n1 + n2);
                        break;
                    case "-":
                        pila.push(n1 - n2);
                        break;
                    case "*":
                        pila.push(n1 * n2);
                        break;
                    case "/":
                        pila.push(n1 / n2);
                        break;
                }
            }
        }
        for (int w = 0; w < pila.size(); w++) {
            resultado += pila.get(w);
        }

        return resultado;
    }
}