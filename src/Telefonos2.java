import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        String contactoUsu;
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> contactos = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("11111");
        telefonos.add("22222");
        contactos.put("Jose", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("33333");
        telefonos.add("44444");
        contactos.put("Michael", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("55555");
        telefonos.add("66666");
        contactos.put("Bob", telefonos);

        System.out.println("Introduzca un contacto" + "\n" + contactos.keySet());
        contactoUsu = sc.nextLine();

        if (telefono(contactos, contactoUsu) == null) {
            System.out.println("Contacto " + contactoUsu + " no exite");
        } else {
            System.out.println(telefono(contactos, contactoUsu));
        }
    }

    public static ArrayList<String> telefono
            (Map<String, ArrayList<String>> contactos, String contactoUsu) {

        for (String contacto : contactos.keySet()) {
            if (contactoUsu.equalsIgnoreCase(contacto)) {
                return contactos.get(contacto);
            }
        }
        return contactos.get(contactoUsu);
    }

}