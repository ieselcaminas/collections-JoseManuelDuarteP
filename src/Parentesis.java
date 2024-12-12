import java.util.Stack;
import java.util.*;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("{[]}"));
    }

    public static boolean esBalanceado(String frase) {
        Stack<Character> signo = new Stack<>();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == '(' || frase.charAt(i) == '{' || frase.charAt(i) == '[') {
                signo.push(frase.charAt(i));

            } else if (frase.charAt(i) == ')') {
                if (signo.isEmpty()) {
                    return false;
                }

                if (signo.peek() == '(') {
                    signo.pop();
                } else {
                    return false;
                }

            } else if (frase.charAt(i) == '}') {
                if (signo.isEmpty()) {
                    return false;
                }

                if (signo.peek() == '{') {
                    signo.pop();
                } else {
                    return false;
                }

            } else if (frase.charAt(i) == ']') {
                if (signo.isEmpty()) {
                    return false;
                }

                if (signo.peek() == '[') {
                    signo.pop();
                } else {
                    return false;
                }
            }
        }

        return signo.isEmpty();
    }
}
