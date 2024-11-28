import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CochesOrdenados {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String coche;
        do {

            System.out.print("Ingrese un coche: ");
            coche = sc.nextLine();
            if (coche != "")
                coches.add(coche);



        } while (coche != "");

        Collections.sort(coches);
        System.out.print(coches);
    }
}
