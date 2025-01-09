package FLUJOS;

import java.util.ArrayList;

public class Problema2 {
    public static void main(String[] args) {
        ArrayList<Person> l = new ArrayList<>();

        Person p = new Person("Juan","Alcazar",1967);
        l.add(p);
        p = new Person("Álvaro","Alcazar",1965);
        l.add(p);
        p = new Person("Manolo","García",1983);
        l.add(p);

        long cuantos = l.stream()
                .filter(w -> w.getLastName().startsWith("A"))
                .count();

        System.out.println(cuantos);
    }
}
