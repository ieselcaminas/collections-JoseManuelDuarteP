import java.util.Map;
import java.util.*;

public class Botin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miembros;
        String[] billetes = {"5", "15", "15", "20", "20", "30", "100", "500"};

        System.out.println("Numero de miembros: ");
        miembros = sc.nextInt();

        System.out.println(reparto(miembros, billetes));

    }

    public static Map<Integer,String> reparto(int miembros, String[] billetes){
        Map<Integer,String> reparto = new HashMap<>();
        int siguiente;

        for (int i = 0; i < billetes.length; i++) {
            siguiente = i % miembros;

            if (reparto.containsKey(siguiente)){
                reparto.put(siguiente,reparto.get(siguiente) + " " + billetes[i]);
            } else {
                reparto.put(siguiente,billetes[i]);
            }

        }

        return reparto;
    }

}