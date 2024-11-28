import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        String contactoUsu;
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> contactos = new HashMap<>();
        contactos.put("Jose", 434342);
        contactos.put("Paco", 264564);
        contactos.put("Manolo", 365464);
        contactos.put("Vladimir", 4868564);

        System.out.println("Introduzca un contacto" + "\n" + contactos.keySet());
        contactoUsu = sc.nextLine();

        if (telefono(contactos, contactoUsu) == 0) {
            System.out.println("Contacto " + contactoUsu + " no exite");
        } else {
            System.out.println(telefono(contactos, contactoUsu));
        }
    }

    public static int telefono(Map<String, Integer> contactos, String contactoUsu) {

        for (String contacto : contactos.keySet()) {
            if (contactoUsu.equalsIgnoreCase(contacto)) {
                return contactos.get(contacto);
            }
        }
        return contactos.getOrDefault(contactoUsu, 0);
    }

}
