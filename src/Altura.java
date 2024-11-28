import java.util.ArrayList;
import java.util.Scanner;

public class Altura {

    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();
        int numAlu;
        double media;
        int altInferior;
        int altSuperior;

        System.out.println("Ingrese el numero de alumnos:");
        numAlu = numeroAlumnos();

        System.out.println("Ingrese las alturas del alumnado:");
        leerAlturas(alturas, numAlu);
        media = media(alturas, numAlu);
        altInferior = calcularAlumnosAlturaInferior(alturas,media);
        altSuperior = calcularAlumnosAlturaSuperior(alturas,media);

        System.out.println(mostrarResultados(alturas, media, altSuperior, altInferior));
    }

    public static int numeroAlumnos() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void leerAlturas(ArrayList<Double> alturas, int numAlu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlu; i++) {
            alturas.add(sc.nextDouble());
        }
    }

    public static double media(ArrayList<Double> alturas, int numAlu) {
        double suma = 0;
        for (int i = 0; i < numAlu; i++) {
            suma += alturas.get(i);
        }
        return suma / numAlu;
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int altSuperior = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {
                altSuperior++;
            }
        }
        return altSuperior;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int altInferior = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {
                altInferior++;
            }
        }
        return altInferior;
    }

    public static String mostrarResultados(ArrayList<Double> alturas,
                                           double media, int altSuperior, int altInferior) {
        String resultado = "Las alturas de los alumnos son:\n" +
                alturas + "\n" +
                "La altura media es: " + media + "\n" +
                altSuperior + " Superan la media.\n" +
                altInferior + " Inferior la media.\n";

        return resultado;
    }
}