package FLUJOS;

import java.util.ArrayList;

public class Problema3 {
    public static void main(String[] args) {
        ArrayList<Person> l = new ArrayList<>();

        Person p = new Person("Juan","Alcazar",1967);
        l.add(p);
        p = new Person("Alvaro","Alcazar",1965);
        l.add(p);
        p = new Person("Manolo","García",1983);
        l.add(p);
        p = new Person("Manolo","Gilberto",1947);
        l.add(p);

        l.stream()
            .map(pe -> pe.getFirstName())
            .distinct()
            .sorted()
            .forEach(n -> System.out.println(n));

    }
}
