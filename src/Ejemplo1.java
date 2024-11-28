import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Seat");
        coches.add("Audi");
        coches.add("BMW");
        coches.add("Honda");

        System.out.println(coches.get(coches.size()-1));

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        coches.remove(0);

        if (coches.isEmpty()) {
            System.out.println("Está vacio");
        }

        Collections.sort(coches);

    }
}
