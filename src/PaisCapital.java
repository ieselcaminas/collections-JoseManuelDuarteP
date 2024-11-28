import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String capitalUsu;
        Map<String,String> capitales = new HashMap<>();
        capitales.put("España","Madrid");
        capitales.put("Francia","París");
        capitales.put("Alemania","Berlín");
        capitales.put("Polonia","Varsovia");
        capitales.put("Portugal","Lisboa");

        System.out.println("Introduzca un país" + "\n" + capitales.keySet());
        capitalUsu = sc.nextLine();

        System.out.println(decirCapital(capitales,capitalUsu));
    }

    public static String decirCapital(Map<String,String>capitales, String capitalUsu){

        for (String paises: capitales.keySet()){
            if (capitalUsu.equalsIgnoreCase(paises)){
                return capitales.get(paises);
            }
        }
        return capitales.getOrDefault(capitalUsu,capitalUsu + " No existe");
    }
}