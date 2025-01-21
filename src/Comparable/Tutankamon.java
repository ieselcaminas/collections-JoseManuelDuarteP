package Comparable;

import java.util.ArrayList;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Tesoro> tesoros = new ArrayList<Tesoro>();

        Tesoro t = new Tesoro(0,"flecha",5,1);
        tesoros.add(t);
        t = new Tesoro(1,"sandalia",10,2);
        tesoros.add(t);
        t = new Tesoro(2,"sarcofago",1000,1000);
        tesoros.add(t);
        t = new Tesoro(3,"mascara",1000,10);
        tesoros.add(t);
        t = new Tesoro(4,"arco",10,2);
        tesoros.add(t);

        tesoros.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
